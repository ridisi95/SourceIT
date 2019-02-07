package HW2;

import java.util.Scanner;

public class HW2t2 {
	public static void main(String[] args) {
		Scanner sideA = new Scanner(System.in);
		Scanner sideB = new Scanner(System.in);
		Scanner sideC = new Scanner(System.in);

		System.out.print("Please, enter side A: ");
		String receivedA = sideA.nextLine();
		System.out.print("Please, enter side B: ");
		String receivedB = sideB.nextLine();
		System.out.print("Please, enter side C: ");
		String receivedC = sideC.nextLine();
		
		double oprA = Double.parseDouble(receivedA);
		double oprB = Double.parseDouble(receivedB);
		double oprC = Double.parseDouble(receivedC);

		double p = (oprA + oprB + oprC) / 2;
		double s = Math.sqrt(p * (p - oprA) * (p - oprB) * (p - oprC));

		if(Double.isNaN(s)){
			System.err.println("The triangle is not exist");
		} else {
			System.out.println("Area of your triangle is " + s + " m2");
		}
	}
}
