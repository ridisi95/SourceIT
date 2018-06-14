package HW8AndHW11;

import java.util.Arrays;
import java.util.Iterator;

public class DemoMyList {
	public static void main(String[] args) {
		DefaultMyList<String> myList = new DefaultMyList<>();

		String str = "my list";
		String str1 = "your list";
		
		String number = "10";
		String strOutArr = "text of my list";
		String moon = "1203";
		
		String math = String.valueOf(Math.PI);

		myList.add(str);
		myList.add(number);
		myList.add(math);
		myList.add(strOutArr);

		for(Object o: myList) {
			System.out.println("Adding to my:  " + o);
		}
		System.out.println();

		Boolean bool = myList.remove(math);

		for(Object o: myList) {
			System.out.println("test of remove():  " + o);
		}
		System.out.println();

		Object[] arr = myList.toArray();
		System.out.println("test of toArray():  " + Arrays.toString(arr));
		System.out.println();

		bool = myList.contains(math);
		System.out.println("test of contains():  " + bool);
		System.out.println();

		DefaultMyList<String> yourList = new DefaultMyList<String>();

		yourList.add(str1);
		yourList.add(math);

		bool = myList.containsAll(yourList);
		System.out.println("test of containsAll():  " + bool);
		System.out.println();

		Iterator<Object> iterMy = myList.iterator();
		while (iterMy.hasNext()) {
			System.out.println("Test Iterator of 'my': " + iterMy.next());
		}
		System.out.println();
		
		Iterator<Object> iterYour = yourList.iterator();
		for(Object o : yourList) {
			System.out.println("Test Iterator of 'your': " + iterYour.next());
		}
		System.out.println();
		
		ListIterator listIterMy = myList.listIterator();
		listIterMy.next();
		listIterMy.set(moon);
		listIterMy.previous();
		
		while (listIterMy.hasNext()) {
			System.out.println("Test ListIterator of 'my': " + listIterMy.next());
		}
		
	}
}
