package HW3;

import java.util.Scanner;

public class HW3t3 {
	public static void main(String[] args) {
		Scanner sclength = new Scanner(System.in);
		System.out.print("Ширина столбца : ");
		int recivedlength = sclength.nextInt();

		Scanner scquantity = new Scanner(System.in);
		System.out.print("Число символов : ");
		int recivedquantity = scquantity.nextInt();

		Scanner scheight = new Scanner(System.in);
		System.out.print("Высота столбца : ");
		int recivedheight = scheight.nextInt();

		for (int o = 0; o < recivedheight; o++) {

			for (int i = 0; i < recivedlength; i++) {
				for (int j = 0; j < recivedquantity; j++) {
					System.out.print("*");
				}
				for (int u = 0; u < recivedquantity; u++) {
					System.out.print("+");
				}

			}
			System.out.println();

		}
	}
}