package hw3;

import java.util.Scanner;

public class Wallpaper {
	public static void main(String[] args) {
		Scanner sclength = new Scanner(System.in);
		System.out.print("Column count : ");
		int length = sclength.nextInt();

		Scanner scquantity = new Scanner(System.in);
		System.out.print("Symbols count : ");
		int quantity = scquantity.nextInt();

		Scanner scheight = new Scanner(System.in);
		System.out.print("Rows count : ");
		int height = scheight.nextInt();

		for (int o = 0; o < height; o++) {

			for (int i = 0; i < length; i++) {

				for (int j = 0; j < quantity; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < quantity; j++) {
					System.out.print("+");
				}
			}
			System.out.println();
		}
	}
}