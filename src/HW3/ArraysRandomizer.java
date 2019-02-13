package HW3;

import java.util.Arrays;
import java.util.Random;

public class ArraysRandomizer {
	public static void main(String[] args) {

		int[] array = new int [10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		
		int[] maodifiedArray = Arrays.copyOf(array, array.length + 10);
		for (int j = 10; j < maodifiedArray.length; j++) {
			maodifiedArray[j] = maodifiedArray[j - 10] * 2;
		}
		System.out.println("Random generated array " + Arrays.toString(array));
		System.out.println("Modified " + Arrays.toString(maodifiedArray));
	}
}