package HW13;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class MaxArrayValueOneThread {

	private int[][] getRandomMatrix() {
		int[][] mass = new int[4][100];
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[1].length; j++) {
				mass[i][j] = (int) (Math.random() * 100);
			}
		}
		return mass;
	}

	private int getMaxValue(int mass[][]) {
		int max = 0;
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[1].length; j++) {
				if (mass[i][j] > max || mass[i][j] == mass[0][0]) {
					max = mass[i][j];
				}
			}
		}
		return max;
	}

	private void printMatrix(int[][] mass) {
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[1].length; j++) {
				System.out.print(mass[i][j] + ", ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		MaxArrayValueOneThread obj = new MaxArrayValueOneThread();
		int[][] mass = obj.getRandomMatrix();
		
		 obj.printMatrix(mass);
		 System.out.println(obj.getMaxValue(mass));
		 double timeSpent = (System.nanoTime() - startTime) / 1_000_000_000.0;
		 System.out.println(timeSpent);
	}
}

