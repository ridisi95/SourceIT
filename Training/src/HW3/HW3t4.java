package HW3;

import java.util.Arrays;
import java.util.Random;

public class HW3t4 {
	public static void main(String[] args) {

		int[] mass = new int [10];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 100);

		}
		int[] masscopy = Arrays.copyOf(mass, mass.length + 10);
		for (int j = 10; j < masscopy.length; j++) {
			masscopy[j] = masscopy[j - 10] * 2;
		}
		System.out.print("Original ");
		System.out.println(Arrays.toString(mass));
		System.out.print("Altered ");
		System.out.println(Arrays.toString(masscopy));
	}
}