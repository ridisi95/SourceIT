package HW13;

import java.util.concurrent.locks.ReentrantLock;

public class Counter extends Thread {
	int i;
	int j;

	public void incrementI() {
		i++;
	};
	public void incrementJ() {
		j++;
	}

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		Waiter waiter1 = new Waiter(counter);
		Thread thread1 = new Thread(waiter1);
		thread1.start();

		Waiter waiter2 = new Waiter(counter);
		Thread thread2 = new Thread(waiter2);
		thread2.start();

		Waiter waiter3 = new Waiter(counter);
		Thread thread3 = new Thread(waiter3);
		thread3.start();
	}
}

class Waiter implements Runnable {
	private Counter counter;
	public Waiter(Counter counter) {
		this.counter = counter;
	}

	private static ReentrantLock lock = new ReentrantLock();

	public void run() {
		try {
			while (true) {
				lock.lock();
				System.out.println(Thread.currentThread().getName() + " i = " + counter.i + " j = " + counter.j + " "
						+ String.valueOf(counter.i == counter.j));
				counter.incrementI();
				Thread.sleep(1000);
				counter.incrementJ();
				lock.unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}