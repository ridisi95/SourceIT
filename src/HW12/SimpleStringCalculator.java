package HW12;

import java.util.Arrays;

public class SimpleStringCalculator {

	public int add(String numbers) {

		int result = 0;

		if (numbers.equals("")) {
			return 0;
			
		} else if (numbers.contains("-")) {
			String[] substringMinus = numbers.replaceAll("(^\\d|[^-\\d]).+?(?=-|$)", "").replaceAll("\\D+", "--").split("\\b-");
			
			try {
				throw new Exception("negatives not allowed");
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(Arrays.toString(substringMinus));
			}
			
		} else {
			String[] substringPlus = numbers.concat("0").replaceAll("\\D", "").split("");
			for (int i = 0; i < substringPlus.length; i++) {
				result += Integer.parseInt(substringPlus[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		SimpleStringCalculator ssc = new SimpleStringCalculator();
		String str = "-1238mc21u41uc123c1-123123-213141-2x12";
		int x = ssc.add(str);
		System.out.println(x);
	}
}
