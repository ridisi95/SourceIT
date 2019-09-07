package hw3;

import java.util.Scanner;

public class Rotator {
	public static void main(String[] args) {
		Scanner scannerWidth = new Scanner(System.in);
		System.out.print("width : ");
		int width = scannerWidth.nextInt();

		Scanner scannerHeight = new Scanner(System.in);
		System.out.print("height : ");
		int height = scannerHeight.nextInt();

		Scanner scannerTurn = new Scanner(System.in);
		System.out.print("turn in degrees (0,90,180,270): ");
		int turn = scannerTurn.nextInt();

		int[][] mass = new int[height][width];

		if (turn == 90) {
			for (int i = width - 1; i >= 0; i--) {
				for (int j = 0; j < height; j++) {
					if (0 == (i - (width - 1)) * (-1)) {
						mass[j][i] = j + 1;
					} else {
						mass[j][i] = ((i - (width - 1)) * (-1)) * height + (j + 1);
					}
				}
			}
		} else if (turn == 180) {
			for (int i = height - 1; i >= 0; i--) {
				for (int j = width - 1; j >= 0; j--) {
					if (i == height - 1) {
						mass[i][j] = (j - width) * (-1);
					} else {
						mass[i][j] = mass[i + 1][0] + (j - width) * (-1);
					}
				}
			}
		} else if (turn == 270) {
			for (int i = 0; i < width; i++) {
				for (int j = height - 1; j >= 0; j--) {
					if (0 == i) {
						mass[j][i] = (j - height) * (-1);
					} else {
						mass[j][i] = mass[0][i - 1] + (j - height) * (-1);
					}
				}
			}
		} else {
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass[i].length; j++) {
					if (i == 0) {
						mass[i][j] += j + 1;
					} else {
						mass[i][j] += (i * width) + (j + 1);
					}
				}
			}
		}
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
