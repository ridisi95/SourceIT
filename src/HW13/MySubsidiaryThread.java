package HW13;

import java.util.concurrent.TimeUnit;

public class MySubsidiaryThread {
	public static void main(String[] args) throws InterruptedException {

		DaughterThread daughterThread = new DaughterThread();
		daughterThread.start();
	
		TimeUnit.SECONDS.sleep(5);

		 daughterThread.interrupt();
		 System.out.println(Thread.currentThread().getName() + " ended its work");	 
		 }
}

class DaughterThread extends Thread {

	@Override
	public void run() {
			try {
				int i = 0;
				while(true) {
				Thread.sleep(445);
				System.out.println(this.getName() + " iteration -" + i++);}
			} catch (InterruptedException e) {	
				System.out.println(this.getName() + " ended its work");;
			}
		
	
	}
	
}

// -----------------------------------> second way

//public class MySubsidiaryThread {
//	public static void main(String[] args) throws InterruptedException {
//
//		DaughterRunnable daughterRunnable = new DaughterRunnable();
//		Thread daughterThread = new Thread(daughterRunnable);
//		daughterThread.start();
//
//		TimeUnit.SECONDS.sleep(5);
//
//		daughterThread.interrupt();
//		System.out.println(Thread.currentThread().getName() + " ended its work");
//	}
//}
//
//class DaughterRunnable implements Runnable {
//
//	@Override
//	public void run() {
//		try {
//			int i = 0;
//			while (true) {
//				Thread.sleep(445);
//				System.out.println(Thread.currentThread().getName() + " iteration -" + i++);
//			}
//		} catch (InterruptedException e) {
//			System.out.println(Thread.currentThread().getName() + " ended its work");
//		}
//
//	}
//
//}
