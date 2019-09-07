package hw5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {

        List<Book> booksList = new ArrayList();

        booksList.add(new Book(1, "Hystory of Ukraine", "V.Svitlichna", "book club", 2004, 420, 150,
                "hard cover"));
        booksList.add(new Book(2, "Me and It", "Sigmund Freud", "book club", 2014, 480, 500, "ultra hard cover"));
        booksList.add(new Book(3, "English for Technical Students", "D.Kobez", "book club", 2009, 240, 200,
                "integrated binding"));
        booksList.add(new Book(4, "SLV", "V.Svitlichna", "Unknown", 2015, 800, 1500, "light cover"));
        booksList.add(new Book(5, "Life of Zuckerberg", "D.Kobez", "Avanta", 2013, 180, 300, "hard cover"));
        booksList.add(new Book(6, "Dictations", "D.Kobez", "Unknown", 2000, 160, 100, "light cover"));

//		booksList.stream().filter(x -> x.getDateOfRelease() > 2010).forEach(System.out::println);
//		System.out.println();
//		booksList.stream().filter(x -> x.getAuthor().equals("D.Kobez")).forEach(System.out::println);
//		System.out.println();
//		booksList.stream().filter(x -> x.getPublishingHouse().equals("book club")).forEach(System.out::println);
//		System.out.println();

        Book[] booksArray = booksList.toArray(new Book[booksList.size()]);

        Book.showDateOfRelease(booksArray, 2010);
        Book.showAuthor(booksArray, "D.Kobez");
        Book.showPublishingHouse(booksArray, "book club");
    }
}
