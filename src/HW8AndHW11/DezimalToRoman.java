package HW8AndHW11;

//shotr table of Unicode https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html 

public class DezimalToRoman {

	private String roman;
	private int dezimal;

	private DezimalToRoman(String roman, int dezimal) {
		this.roman = roman;
		this.dezimal = dezimal;
	}

	final static DezimalToRoman one = new DezimalToRoman("I", 1);
	final static DezimalToRoman five = new DezimalToRoman("V", 5);
	final static DezimalToRoman ten = new DezimalToRoman("X", 10);
	final static DezimalToRoman fifty = new DezimalToRoman("L", 50);
	final static DezimalToRoman hundred = new DezimalToRoman("C", 100);

	final static DezimalToRoman[] arrOfNumbers = { one, five, ten, fifty, hundred };

	private static String dezimalToRoman(int dezimal) {

		String result = "";

		if (dezimal > 100) {
			return "More then 100";
		} else if (dezimal == 100) {
			return "C";
		} else if (dezimal > 89) {
			result += "XC";
		} else if (dezimal > 49) {
			result += "L";
		} else if (dezimal > 39) {
			result += "XL";
		}

		while (((int) dezimal / 10) * 10 > DezimalToRoman.romanToDezimal(result)) {
			result += "X";
		}

		String units = "";

		for (int i = 0; i < 3; i++) {
			if (i > 0) {
				units = (i == 1) ? "IV" : "V";
			}
			for (int j = 0; j < 4; j++) {
				if (!units.contains("IVI") && dezimal == DezimalToRoman.romanToDezimal(result + units)) {
					return (result + units);
				}
				units += "I";
			}
		}
		return result + "IX";
	}

	private static int romanToDezimal(String roman) {

		DezimalToRoman[] romanModObj = new DezimalToRoman[roman.length()];
		String[] romanMod = roman.split("");

		for (int i = 0; i < romanMod.length; i++) {
			for (int j = 0; j < arrOfNumbers.length; j++) {

				if (romanMod.length == 1 && romanMod[i].equals(arrOfNumbers[j].roman)) {
					return arrOfNumbers[j].dezimal;
				} else if (romanMod[i].equals(arrOfNumbers[j].roman)) {
					romanModObj[i] = arrOfNumbers[j];
				}
			}
		}

		int result = 0;

		for (int i = 1; i < romanModObj.length; i++) {
			if (romanModObj[i - 1].dezimal >= romanModObj[i].dezimal) {
				result += romanModObj[i - 1].dezimal;
			} else {
				result -= romanModObj[i - 1].dezimal;
			}
			if (i == romanModObj.length - 1) {
				result += romanModObj[i].dezimal;
			}
		}

		return result;
	}

	// @Override
	// public String toString() {
	// return this.dezimalToRoman(dezimal) + " ===> " + this.romanToDezimal(roman) +
	// " ===> " + this.dezimalToRoman(dezimal);
	// }

	public static void main(String[] args) {

		for (int i = 1; i < 101; i++) {

			System.out.println(DezimalToRoman.dezimalToRoman(i) + " ===> " +
					+ DezimalToRoman.romanToDezimal(DezimalToRoman.dezimalToRoman(i)) + " ===> "
					+ DezimalToRoman.dezimalToRoman(i));

		}
		
		

	}

}
