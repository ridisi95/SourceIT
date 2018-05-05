package HW2;

import java.util.Arrays;
import java.util.Scanner;

public class HW2t1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter a number: ");
		String nextLine = sc.nextLine();
		String str = (nextLine);
		// String[] namesofmass = new String[] {str};
		String[] namesofmass = (nextLine).split("");
		for (int i = 0; i < namesofmass.length; i++) {
			System.out.println(" " + namesofmass[i]);
		}
		// System.out.println(nextLine);
		// System.out.println(namesofmass[0]);

	}
}
