package HW8;
 
//shotr table of Unicode https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html 

public class DezimalToRomanFinal {

	private String roman;
	private int dezimal;

	private DezimalToRomanFinal(String roman, int dezimal) {
		this.roman = roman;
		this.dezimal = dezimal;
	}

	private void setRoman(String roman) {
		this.roman = roman;
	}

	private void setDezimal(int dezimal) {
		this.dezimal = dezimal;
	}

	final static DezimalToRomanFinal one = new DezimalToRomanFinal("I", 1);
	final static DezimalToRomanFinal five = new DezimalToRomanFinal("V", 5);
	final static DezimalToRomanFinal ten = new DezimalToRomanFinal("X", 10);
	final static DezimalToRomanFinal fifty = new DezimalToRomanFinal("L", 50);
	final static DezimalToRomanFinal hundred = new DezimalToRomanFinal("C", 100);

	final static DezimalToRomanFinal[] arrOfNumbers = { one, five, ten, fifty, hundred };

	// private static String dezimalToRoman(int dezimal) {S
	//
	// Dezimal2 infoKeeper = new Dezimal2(null,0);
	//
	//// String[] y = {String.valueOf(dezimal).s,St};
	//
	// String y = "";
	//
	// int count = 0;
	//
	// for(int i = 0; i < dezimal; i ++) {
	//
	// while(y.contains("IIII")) {
	//
	// if(y.contains("IIII")) {
	// y = "";
	// y += arrOfNumbers[0].roman;
	//
	// }
	// if (Dezimal2.romanToDezimal(y) == dezimal) {
	// return y;
	// }
	// }
	// String result = "мимо";
	// return result;
	// }

	private static int romanToDezimal(String roman) {

		DezimalToRomanFinal[] romanModObj = new DezimalToRomanFinal[roman.length()];
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

	public static void main(String[] args) {

		// System.out.println(Dezimal2.dezimalToRoman(5));
		System.out.println(DezimalToRomanFinal.romanToDezimal("LVI"));

	}

}
