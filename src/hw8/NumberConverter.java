package hw8;

//shotr table of Unicode https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html 

import java.util.ArrayList;
import java.util.List;

public class NumberConverter {

    final Number one = new Number("I", 1);
    final Number five = new Number("V", 5);
    final Number ten = new Number("X", 10);
    final Number fifty = new Number("L", 50);
    final Number hundred = new Number("C", 100);

    final Number[] arrOfNumbers = {one, five, ten, fifty, hundred};

    private String convertDecimalToRoman(int decimal) {
        String result = "";

        if (decimal > 100) {
            return "More then 100";
        } else if (decimal == 100) {
            return "C";
        } else if (decimal > 89) {
            result += "XC";
        } else if (decimal > 49) {
            result += "L";
        } else if (decimal > 39) {
            result += "XL";
        }

        while ((decimal / 10) * 10 > convertRomanToDecimal(result)) {
            result += "X";
        }

        String units = "";

        for (int i = 0; i < 3; i++) {
            if (i > 0) {
                units = (i == 1) ? "IV" : "V";
            }
            for (int j = 0; j < 4; j++) {
                if (!units.contains("IVI") && decimal == convertRomanToDecimal(result + units)) {
                    return (result + units);
                }
                units += "I";
            }
        }
        return result + "IX";
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
