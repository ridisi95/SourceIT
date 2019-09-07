package hw3;

import java.util.Scanner;

public class PrimeNumberSearcher {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter a number: ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				double x = (double) i / j;
				if (x % 1 == 0) {
					count++;
				}
			}

			if (count == 2 || i == 2) {
				System.out.println(i);
			}
		}
	}
}
