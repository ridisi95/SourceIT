package HW8;

import java.util.Arrays;

public class DemoMyList {
	public static void main(String[] args) {
		DefaultMyList my = new DefaultMyList();
		
		
		String str = "some text";
		int number = 10;
		String strOutArr = "string is out of array";
		int moon = 1203;
	
		 

		my.add(str);
		my.add(number);
		my.add(Math.PI);
		my.add(strOutArr);

		System.out.println(my.get(0));
		System.out.println(my.get(1));
		System.out.println(my.get(2));
		System.out.println(my.get(3));
		System.out.println();
		
		Boolean bool = my.remove(Math.PI);
		
		System.out.println(bool);
		System.out.println(my.get(0));
		System.out.println(my.get(1));
		System.out.println(my.get(2));
		System.out.println();
		
		Object[] arr = my.toArray();
		System.out.println(Arrays.toString(arr));
		
		bool = my.contains(Math.PI);
		System.out.println(bool);
		
		
		
//		my.clear();
//		System.out.println(my.get(0));
		
		

	}
}
