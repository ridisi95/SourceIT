package hw8;

//short table of Unicode https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class NumberConverter {

    private static final String ONE_ROMAN = "I";
    private static final String FIVE_ROMAN = "V";
    private static final String TEN_ROMAN = "X";
    private static final String FIFTY_ROMAN = "L";
    private static final String ONE_HUNDRED_ROMAN = "C";

    private final Number ONE_NUMBER = new Number(ONE_ROMAN, 1);
    private final Number FIVE_NUMBER = new Number(FIVE_ROMAN, 5);
    private final Number TEN_NUMBER = new Number(TEN_ROMAN, 10);
    private final Number FIFTY_NUMBER = new Number(FIFTY_ROMAN, 50);
    private final Number ONE_HUNDRED_NUMBER = new Number(ONE_HUNDRED_ROMAN, 100);

    final Number[] arrOfNumbers = {ONE_NUMBER, FIVE_NUMBER, TEN_NUMBER, FIFTY_NUMBER, ONE_HUNDRED_NUMBER};

    private String convertDecimalToRoman(int decimal) {
        String result = "";

        if (decimal > 100) {
            return "More then 100";
        } else if (decimal == 100) {
            return ONE_HUNDRED_ROMAN;
        } else if (decimal > 89) {
            result += TEN_ROMAN + ONE_HUNDRED_ROMAN;
        } else if (decimal > 49) {
            result += FIFTY_ROMAN;
        } else if (decimal > 39) {
            result += TEN_ROMAN + FIFTY_ROMAN;
        }

        while ((decimal / 10) * 10 > convertRomanToDecimal(result)) {
            result += TEN_ROMAN;
        }

        String units = "";

        for (int i = 0; i < 3; i++) {
            if (i > 0) {
                units = (i == 1) ? ONE_ROMAN + FIVE_ROMAN : FIVE_ROMAN;
            }
            for (int j = 0; j < 4; j++) {
                if (!units.contains(ONE_ROMAN + FIVE_ROMAN + ONE_ROMAN) && decimal == convertRomanToDecimal(result + units)) {
                    return (result + units);
                }
                units += ONE_ROMAN;
            }
        }
        return result + ONE_ROMAN + TEN_NUMBER;
    }

    private int convertRomanToDecimal(String roman) {
        Number[] romanModObj = new Number[roman.length()];
        String[] romanMod = roman.split("");

        for (int i = 0; i < romanMod.length; i++) {
            for (int j = 0; j < arrOfNumbers.length; j++) {

                if (romanMod.length == 1 && romanMod[i].equals(arrOfNumbers[j].roman)) {
                    return arrOfNumbers[j].decimal;
                } else if (romanMod[i].equals(arrOfNumbers[j].roman)) {
                    romanModObj[i] = arrOfNumbers[j];
                }
            }
        }

        int result = 0;

        for (int i = 1; i < romanModObj.length; i++) {
            if (romanModObj[i - 1].decimal >= romanModObj[i].decimal) {
                result += romanModObj[i - 1].decimal;
            } else {
                result -= romanModObj[i - 1].decimal;
            }
            if (i == romanModObj.length - 1) {
                result += romanModObj[i].decimal;
            }
        }
        return result;
    }

    public void showConvertingFromOneToOneHundred() {
        List<ValueKeeper> valueKeepersList = new ArrayList();
        ValueKeeper valueKeeper;

        for (int i = 1; i < 101; i++) {
            valueKeeper = new ValueKeeper();
            valueKeeper.setIncomingValue(convertDecimalToRoman(i));
            valueKeeper.setIntermediateValue(convertRomanToDecimal(valueKeeper.getIncomingValue()));
            valueKeeper.setFinalValue(convertDecimalToRoman(i));

            valueKeepersList.add(valueKeeper);
        }
        valueKeepersList.forEach(System.out::println);
    }

    private class Number {
        private String roman;
        private int decimal;

        private Number(String roman, int decimal) {
            this.roman = roman;
            this.decimal = decimal;
        }
    }

    private class ValueKeeper {
        private String incomingValue;
        private int intermediateValue;
        private String finalValue;

        public String getIncomingValue() {
            return incomingValue;
        }

        public void setIncomingValue(String incomingValue) {
            this.incomingValue = incomingValue;
        }

        public void setIntermediateValue(int intermediateValue) {
            this.intermediateValue = intermediateValue;
        }

        public void setFinalValue(String finalValue) {
            this.finalValue = finalValue;
        }

        @Override
        public String toString() {
            return String.format(" %7s\t ===> %7d\t ===> %7s\t", incomingValue, intermediateValue, finalValue);
        }
    }

    public static void main(String[] args) {
        NumberConverter numberConverter = new NumberConverter();

        System.out.println(numberConverter.convertDecimalToRoman(32));
        System.out.println(numberConverter.convertRomanToDecimal("LXXXI"));

//		convertDecimalToRoman.showConvertingFromOneToOneHundred(); // show all numbers from 1 to 100
    }
}
