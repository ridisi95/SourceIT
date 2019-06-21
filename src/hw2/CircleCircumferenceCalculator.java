package hw2;

import java.util.Scanner;

public class CircleCircumferenceCalculator {
	public static void main(String[] args) {
		Scanner scannedRadius = new Scanner(System.in);
		System.out.print("Please, enter side A: ");
		String radius = scannedRadius.nextLine();

		Double circumference = 2 * Math.PI * Double.parseDouble(radius);

		System.out.println("Circumference Of Circle equals " + circumference);
	}
}


