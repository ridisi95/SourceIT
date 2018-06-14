package HW8AndHW11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class ListsSpeedTest {

	public static void main(String[] args) {

		ArrayList<Object> arrayList = new ArrayList<>(1_000_000);
		LinkedList<Object> linkedList = new LinkedList<>();

		long startTime = System.nanoTime();

		/*
		 * this block worked ~ 2078615568612 of nano time (0,09 seconds)
		 */
		//
		// for (int i = 0; i < 1_000_000; i++) {
		// arrayList.add(i);
		// }
		//
		// /*
		// * this block worked ~ 2078615568612 of nano time (30 min)
		// */
		//
		// for(int i = 0; i < 1_000_000; i++) {
		// arrayList.add(999_999-i, 999_999-i);
		// }
		//
		/*
		 * // * this block worked ~ 1072868738 of nano time (1,07 seconds) //
		 */
		// for (int i = 0; i < 500; i++) {
		// arrayList.add(499 - i, 499 - i);
		// }
		//
		// /*
		// * this block worked ~ 0,16653912 of nano time (0,17 seconds)
		// */
		// for (int i = 0; i < 1_000_000; i++) {
		// linkedList.add(i);
		// }
		//
		// /*
		// * this block worked ~ 6220944934041 of nano time (1 hour 43 min)
		// */
		// for( int i = 0; i < 1_000_000; i++) {
		// linkedList.add(999_999-i, 999_999-i);
		// }
		//
		// /*
		// * this block worked ~ 217450648 of nano time (0,22 seconds)
		// */
		// for(int i = 0; i < 500; i++) {
		//
		// linkedList.add(499 - i, 499 - i);
		//
		// }

		long timeSpent = System.nanoTime() - startTime;
		System.out.println("программа выполнялась " + timeSpent + " наносекунд");
	}

}
