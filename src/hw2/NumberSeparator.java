package hw2;

import java.util.Scanner;

public class NumberSeparator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter a number: ");
		String nextLine = sc.nextLine();
		String str = (nextLine);

		String[] namesofmass = (nextLine).split("");
		for (int i = 0; i < namesofmass.length; i++) {
			System.out.println(" " + namesofmass[i]);
		}
	}
}
