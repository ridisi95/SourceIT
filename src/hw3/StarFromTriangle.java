package hw3;

import java.util.Scanner;

public class StarFromTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter a number: ");
		int number = Math.abs(sc.nextInt());

		String star = " *";

		for (int i = 0; i <= number; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}

		for (int i = 1; i < number; i++) {
			for (int j = 0; j < (number - i); j++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
}