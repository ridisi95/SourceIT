package HW5;

import java.util.Arrays;

public class Book {

	int id;
	String title;
	String author;
	String publishingHouse;
	int dateOfRelease;
	int pages;
	int price;
	String binding;

	public Book(int id, String title, String author, String publishingHouse, int dateOfRelease, int pages, int price,
			String binding) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.dateOfRelease = dateOfRelease;
		this.pages = pages;
		this.price = price;
		this.binding = binding;

	}

	public int getid() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public int getDateOfRelease() {
		return dateOfRelease;
	}

	public int getPages() {
		return pages;
	}

	public int getPrice() {
		return price;
	}

	public String getBinding() {
		return binding;
	}

	@Override
	public String toString() { // ink for learn:
								// http://study-java.ru/uroki-java/formatirovanie-chisel-i-texta-v-java/
		return String.format(
				"ID: %d\t title: %30s\t author: %s\t publishingHouse: %s\t dateOfRelease: %d\t pages: %d\t price: %d\t binding: %s",
				id, title, author, publishingHouse, dateOfRelease, pages, price, binding);
	}

	public static void showAuthor(Book arr[], String nameofAuthor) {
		for (int i = 0; i < arr.length; i++) {
			if (nameofAuthor.equals(arr[i].getAuthor())) {
				System.out.println(arr[i]);

			}
		}
		System.out.println();
	}

	public static void showPublishingHouse(Book arr[], String publishingHouse) {
		for (int i = 0; i < arr.length; i++) {
			if (publishingHouse.equals(arr[i].getPublishingHouse())) {
				System.out.println(arr[i]);

			}
		}
		System.out.println();

	}

	public static void showDateOfRelease(Book arr[], int year) {
		for (int i = 0; i < arr.length; i++) {
			if (year < arr[i].getDateOfRelease()) {
				System.out.println(arr[i]);

			}
		}
		System.out.println();
	}

}