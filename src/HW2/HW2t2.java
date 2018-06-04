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

		double P, S;
		// int oprA = Integer.parseInt(receivedA);
		// int oprB = Integer.parseInt(receivedB);
		// int oprC = Integer.parseInt(receivedC);

		double oprA = Double.parseDouble(receivedA);
		double oprB = Double.parseDouble(receivedB);
		double oprC = Double.parseDouble(receivedC);

		P = (oprA + oprB + oprC) / 2;
		S = Math.sqrt(P * (P - oprA) * (P - oprB) * (P - oprC));
		System.out.println("Area of your triangle is " + S + " cm");

		// class Ñalculation {
		//// double receivedA, receivedB, receivedC, P, S;
		//
		// public void foo() {
		// P = (receivedA + receivedB + receivedC)/2;
		// S = Math.sqrt(P*(P-receivedA)*(P-receivedB)*(P-receivedC));
		// System.out.println("Area of your triangle is " + S);
		// System.out.println(receivedA);
		//
		// }
		//
		// }
		// Ñalculation triangle = new Ñalculation();
		// triangle.foo();
	}
}
