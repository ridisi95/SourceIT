package HW8;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {

		int[] mas = new int[10];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 100);
		}

		for (int i = 1; i < mas.length; i++) {
			int count = 0;

			if (mas[i - 1] > mas[i]) {
				int exchangeToTheRight = mas[i - 1];
				mas[i - 1] = mas[i];
				mas[i] = exchangeToTheRight;
				count++;
			}
			if (count > 0) {
				i = 0;
			}

		}
		System.out.println(Arrays.toString(mas));
	}
}
