package HW8AndHW11;

import java.util.Scanner;

public class DegreesByClock {
	public static void main(String[] args) {

		Scanner scanTime = new Scanner(System.in);
		System.out.print("ֲגוהטעו גנולÿ: ");
		String string = scanTime.nextLine().replaceAll("[\\Wa-zA-Zא-ÿְ-ÿ]", "");
		
		if(string.length() < 4) {
			string = "0" + string;
		}
	
		int hours = Integer.parseInt(string.substring(0, 2)) * 5;
		int min = Integer.parseInt(string.substring(2, 4));
		
		if( hours > 12*5) {
			hours -= 12*5;
		} 

		int result;
		
		if (hours > min) {
			result = 360 - (hours - min) * 6;
		} else {
			result = (min - hours) * 6;
		}
		
		System.out.println(result);
	}
}
