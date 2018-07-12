package HW3;

import java.util.Arrays;
import java.util.Scanner;

public class HW3t5 {
	public static void main(String[] args) {
		Scanner scwidth = new Scanner(System.in);
		System.out.print("������ ������: "); ////213 21321 312321312321
		int recivedwidth = scwidth.nextInt();

		Scanner scheight = new Scanner(System.in);
		System.out.print("������ �������: ");
		int recivedheight = scheight.nextInt();

		Scanner scturn = new Scanner(System.in);
		System.out.print("������ �������� (0,90,180,270): ");
		int recived�dturn = scturn.nextInt();

		int[][] mass = new int[recivedheight][recivedwidth];

		if (recived�dturn == 90) {

			for (int i = recivedwidth - 1; i >= 0; i--) {
				for (int j = 0; j < recivedheight; j++) {
					if (0 == (i - (recivedwidth - 1)) * (-1)) {
						mass[j][i] = j + 1;
					} else {
						mass[j][i] = ((i - (recivedwidth - 1)) * (-1)) * recivedheight + (j + 1);
					}
				}

			}
		} else if (recived�dturn == 180) {
			for (int i = recivedheight - 1; i >= 0; i--) {
				for (int j = recivedwidth - 1; j >= 0; j--) {
					if (i == recivedheight - 1) {
						mass[i][j] = (j - recivedwidth) * (-1);
					} else {
						mass[i][j] = mass[i + 1][0] + (j - recivedwidth) * (-1);
					}
				}

			}
		} else if (recived�dturn == 270) {
			for (int i = 0; i < recivedwidth; i++) {
				for (int j = recivedheight - 1; j >= 0; j--) {
					if (0 == i) {
						mass[j][i] = (j - recivedheight) * (-1);
					} else {
						mass[j][i] = mass[0][i - 1] + (j - recivedheight) * (-1);
					}
				}

			}
		} else {
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass[i].length; j++) {
					if (i == 0) {
						mass[i][j] += j + 1;
					} else {
						mass[i][j] += (i * recivedwidth) + (j + 1);
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
