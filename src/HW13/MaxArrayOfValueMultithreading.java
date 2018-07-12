package HW13;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MaxArrayOfValueMultithreading {
	private int[][] mass;
	private int maxInMass;
	private List<Future<Integer>> futureList;
	
	public MaxArrayOfValueMultithreading(int[][] mass) {
		this.mass = mass;
		futureList = new ArrayList<>();
	}
	public List<Future<Integer>> getFutureList() {
		return futureList;
	}

	private static int[][] getRandomMatrix() {
		int[][] mass = new int[4][1000];
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[1].length; j++) {
				mass[i][j] = (int) (Math.random() * 100);
				System.out.print(mass[i][j] + ", ");
			}
			System.out.println();
		}
		return mass;
	}

	private void getMaxRowValue() throws InterruptedException, ExecutionException {
		Callable<Integer>[] arrFinders = new MyThread[mass.length];
		ExecutorService es = Executors.newCachedThreadPool();
		for (int i = 0; i < arrFinders.length; i++) {
			arrFinders[i] = new MyThread(i);
			futureList.add(es.submit(arrFinders[i]));
		}
		es.shutdown();
		int max = futureList.get(0).get();
		for (Future<Integer> future : futureList) {
			if (future.get() > max) {
				max = future.get();
			}
		}
		maxInMass = max;
		System.out.println(maxInMass);
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long startTime = System.nanoTime();
		MaxArrayOfValueMultithreading maovm = new MaxArrayOfValueMultithreading(
				MaxArrayOfValueMultithreading.getRandomMatrix());
		maovm.getMaxRowValue();
		double timeSpent = (System.nanoTime() - startTime) / 1_000_000_000.0;
		 System.out.println(timeSpent);
	}

	private class MyThread implements Callable<Integer> {
		private int threadId;
		private int maxOfThread;
		
		public MyThread(int threadId) {
			this.threadId = threadId;
		}
		@Override
		public Integer call() throws Exception {
			for (int i = 0; i < mass[threadId].length; i++) {
				if (mass[threadId][i] > maxOfThread || mass[threadId][i] == mass[0][0]) {
					maxOfThread = mass[threadId][i];
					Thread.currentThread().sleep(1);
				}
			}
			return maxOfThread;
		}
	}
}
