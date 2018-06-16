package HW13;

public class Counter {
	public int i;
	public int j;

	public int count1() {
		return i++;
	}

	public int count2() {
		return j++;
	}

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		MyThread thread3 = new MyThread();

		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class MyThread extends Thread {
	Counter counter = new Counter();

	@Override
	public synchronized void run() {
		try {
			while (true) {
				System.out.println(this.getName() + " counter1 = " + counter.i + " counter2 " + counter.j + " "
						+ String.valueOf(counter.i == counter.j));
				counter.count1();
				Thread.sleep(10);
				counter.count2();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}