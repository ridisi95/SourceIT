package HW12;

import java.util.Arrays;

public class SimpleStringCalculator {

	public int add(String numbers) throws Exception {

		int result = 0;

		if (numbers.equals("")) {
			return 0;
			
		} else if (numbers.contains("-")) {
			String[] substringMinus = numbers.replaceAll("(^\\d|[^-\\d]).+?(?=-|$)|\\D{2}", "").replaceAll("\\D+", "--")
					.replaceFirst("^\\D", "").split("\\b-");
			throw new Exception("negatives not allowed " + Arrays.toString(substringMinus));

		} else if (numbers.matches("(.*)\\d(.*)")){
			String[] substringPlus = numbers.replaceFirst("^.*?(?=\\d)", "").split("\\D+");
			for (int i = 0; i < substringPlus.length; i++) {
				if(Integer.parseInt(substringPlus[i]) <= 1000) {
				result += Integer.parseInt(substringPlus[i]);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		SimpleStringCalculator ssc = new SimpleStringCalculator();
		String str = "1001 1";
		int x = ssc.add(str);
		System.out.println(x);
	}
}
