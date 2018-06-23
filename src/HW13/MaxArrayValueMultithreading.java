package HW13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

public class MaxArrayValueMultithreading {

	private static int[][] mass = new int[4][4];

	private static int max;
	private static int i;
	private static int j;
	private static AtomicBoolean stop = new AtomicBoolean(true);
	private static ReentrantLock lock = new ReentrantLock();

	private static ExecutorService executor = Executors.newSingleThreadExecutor();

	private static void stopIt() {
		stop.set(false);
	}

	private static void createNewValue() {
		mass[i][j] = (int) (Math.random() * 100);

	}

	private static void printMatrix() {
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[1].length; j++) {
				System.out.print(mass[i][j] + ", ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		long startTime = System.nanoTime();
		MatrixThread matrixThread1 = new MatrixThread();
		Thread thread1 = new Thread(matrixThread1);

		MatrixThread matrixThread2 = new MatrixThread();
		Thread thread2 = new Thread(matrixThread2);

		MatrixThread matrixThread3 = new MatrixThread();
		Thread thread3 = new Thread(matrixThread3);

		MatrixThread matrixThread4 = new MatrixThread();
		Thread thread4 = new Thread(matrixThread4);

		thread1.start();

		thread1.join();

		printMatrix();

		System.out.println(max);
		double timeSpent = (System.nanoTime() - startTime) / 1_000_000_000.0;
		System.out.println(timeSpent);

	}

	static class MatrixThread implements Runnable {

		@Override
		public void run() {
			while (stop.get()) {
				lock.lock();
				if (stop.get()) {
					if (j == mass[i].length) {
						i++;
						j = 0;
					}
					createNewValue();
					j++;
					if (i == mass.length - 1 && j == mass[i].length) {
						stopIt();
						j--;
					}
					lock.unlock();

//					lock.lock();
//					if (future.get() > max) {
//						max = future.get();
//					}
//					lock.unlock();
					

						// try {
						// Thread.sleep(445);
						// } catch (InterruptedException e) {
						// System.out.println(Thread.currentThread().getName() + " ended its work");
						// }
					}
				}

			}
		}
	}

