package HW2;

import java.util.Scanner;

public class HW2t3 {
	public static void main(String[] args) {
		Scanner radiusreceived = new Scanner(System.in);

		System.out.print("Please, enter side A: ");
		String radiusstr = radiusreceived.nextLine();

		double pi = 3.1415926535, D, L;
		double r = Double.parseDouble(radiusstr);

		L = 2 * Math.PI * r;

		// System.out.println("pi " + pi);
		// System.out.println("r " + r);
		//
	}
}


