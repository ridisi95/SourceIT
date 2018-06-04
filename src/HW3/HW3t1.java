package HW3;

import java.util.Scanner;

public class HW3t1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter a number: ");
		int number = sc.nextInt();

		if (number < 0) {
			number *= (-1);
		}

		for (int i = 1; i <= number; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" " + "*");

			}
			System.out.println();
		}
		for (int i = 1; i < number; i++) {
			for (int j = 0; j < (number - i); j++) {
				System.out.print(" " + "*");
			}
			System.out.println();
		}
	}
}