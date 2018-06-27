package HW12;

public class SimpleStringCalculator {

	public int add(String numbers) {

		int result = 0;

		if (numbers.equals("")) {
			return 0;
			
		} else if (numbers.contains("-")) {
			String[] substringMinus = numbers.replaceAll("[^-\\d]", "").replaceAll("\\B\\d|^\\d|-+$", "")
					.replaceAll("\\D+", "-").split("");
			try {
				throw new Exception("negatives not allowed");
			} catch (Exception e) {
				e.printStackTrace();
				for (int i = 0; i < substringMinus.length; i += 2) {
					System.err.print(substringMinus[i] + substringMinus[i + 1] + ", ");
				};
				System.out.println();
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
		String str = "-1238mc21u41uc-123c12x1-2";
		int x = ssc.add(str);
		System.out.println(x);
	}
}
