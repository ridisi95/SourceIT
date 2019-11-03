package hw2;

import java.util.Scanner;

public class NumberSeparator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число: ");
		String a = scanner.next();
		System.out.println("Ваше число: ");
		int n  = a.length();

		for (int i = 0; i < n; i++)
			System.out.println(a.charAt(i));
	}
}
