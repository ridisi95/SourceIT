package HW13;

import java.util.Arrays;

public class MaxArrayValueMultithreading {

	public int[][] getRandomMatrix() {

		int[][] mass = new int[4][100000];
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[1].length; j++) {
				mass[i][j] = (int) (Math.random() * 100);
			}
		}
		return mass;
	}

	public int getMaxValue(int mass[][]) {
		int max = 0;
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[1].length; j++) {
				if (mass[i][j] > max || mass[i][j] == mass[0][1]) {
					max = mass[i][j];
				}
			}
		}
		return max;
	}

	public void printMatrix(int[][] mass) {
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[1].length; j++) {
				System.out.print(mass[i][j] + ", ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		/*
		 * One thread spent ~ 4,01 seconds 
		 */
		
		MaxArrayValueMultithreading obj = new MaxArrayValueMultithreading();
		int[][] mass = obj.getRandomMatrix();
		long startTime = System.nanoTime();
		obj.printMatrix(mass);
		System.out.println(obj.getMaxValue(mass));
		long timeSpent = System.nanoTime() - startTime;
		System.out.println(timeSpent);
	}
}
