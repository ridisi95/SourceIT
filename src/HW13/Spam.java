package HW13;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.sun.corba.se.spi.ior.iiop.GIOPVersion;

public class Spam {
	public int[] giveMeRandomNumbers() {

		int[] mass = new int[10];
		for (int i = 0; i < 10; i++) {
			mass[i] = (int) (Math.random() * 2000);
		}
		Arrays.sort(mass);
		return mass;
	}

	public String[] giveMeRandomStrings() {

		String[] stringArr = new String[10];

		for (int i = 0; i < 10; i++) {
			String symbol = Character.toString((char) (Math.random() * 100)) + i;
			stringArr[i] = symbol;
		}

		return stringArr;
	}

	public static void main(String[] args) throws InterruptedException {

		SomeThread someThread = new SomeThread();

		someThread.start();

		TimeUnit.SECONDS.sleep(5);

		ByteArrayInputStream in = new ByteArrayInputStream("\n".getBytes());
		
		StringWriter stringwriter = new StringWriter();	
		System.setIn(in);
		System.setIn(System.in);
		
		new Scanner(System.in).nextLine();

		someThread.interrupt();
		System.out.println(Thread.currentThread().getName() + " ended its work");

	}

}

class SomeThread extends Thread {

	Spam spam = new Spam();

	int[] timeArr = spam.giveMeRandomNumbers();
	String[] stringArr = spam.giveMeRandomStrings();

	@Override
	public void run() {
		try {
			int i = 0;

			while (true) {

				Thread.sleep(timeArr[i]);
				System.out.println(Thread.currentThread().getName() + " message: " + stringArr[i]);
				i++;
				if (i == 9) {
					i = 0;
				}

			}

		} catch (InterruptedException e) {
			System.out.println(this.getName() + " ended its work");

		}

	}

}
