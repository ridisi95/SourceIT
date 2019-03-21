package HW6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import HW5.Book;
import HW6.Candy;

public class Gift {

	public static void showMeontentGift(ArrayList<Candy> arr) {

		for (Candy i : arr) {
			System.out.println(i);
		}
		System.out.println();
	}

	public static void howMutchWeighGift(ArrayList<Candy> arr) {
		int result = 0;
		for (int i = 0; i < arr.size(); i++) {
			result += arr.get(i).getWeight();
		}
		System.out.println("Weigh gift is: " + result);
		System.out.println();
	}

	public static void showMeCandyWithThisSugarPerecent(ArrayList<Candy> arr, int sugarPercent) {
		int x = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (sugarPercent == arr.get(i).getPercentOfSugar()) {
				x++;
				System.out.println(arr.get(i));

			}
		}
		if (x == 0) {
			System.out.println("Sorry, We not Found candy in gift with " + sugarPercent + " precent of sugar");
		}
		System.out.println();
	}
}
