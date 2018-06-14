package HW8;

import java.util.Arrays;
import java.util.Iterator;

public class DemoMyList {
	public static void main(String[] args) {
		DefaultMyList my = new DefaultMyList();

		String str = "my list";
		String str1 = "your list";
		
		int number = 10;
		String strOutArr = "text of my list";
		int moon = 1203;

		my.add(str);
		my.add(number);
		my.add(Math.PI);
		my.add(strOutArr);

		for(Object o: my) {
			System.out.println("Adding to my:  " + o);
		}
		System.out.println();

		Boolean bool = my.remove(Math.PI);

		for(Object o: my) {
			System.out.println("test of remove():  " + o);
		}
		System.out.println();

		Object[] arr = my.toArray();
		System.out.println("test of toArray():  " + Arrays.toString(arr));
		System.out.println();

		bool = my.contains(Math.PI);
		System.out.println("test of contains():  " + bool);
		System.out.println();

		DefaultMyList your = new DefaultMyList();

		your.add(str1);
		your.add(Math.PI);

		bool = my.containsAll(your);
		System.out.println("test of containsAll():  " + bool);
		System.out.println();

		Iterator<Object> iterMy = my.iterator();
		while (iterMy.hasNext()) {
			System.out.println("Test Iterator of 'my': " + iterMy.next());
		}
		System.out.println();
		
		Iterator<Object> iterYour = your.iterator();
		for(Object o : your) {
			System.out.println("Test Iterator of 'your': " + iterYour.next());
		}
		System.out.println();
		
		ListIterator listIterMy = my.listIterator();
		listIterMy.next();
		listIterMy.set(moon);
		listIterMy.previous();
		
		while (listIterMy.hasNext()) {
			System.out.println("Test ListIterator of 'my': " + listIterMy.next());
		}
		
	}
}
