package hw4;


public class MaxValueOfArray {

	public static void getMaxArrayValue(int array[]) {
		int maxValue = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		System.out.println(maxValue);
	}

	public static void main(String ... args) {
		getMaxArrayValue(new int[] {0,65,54,99,2,43});
	}
}
