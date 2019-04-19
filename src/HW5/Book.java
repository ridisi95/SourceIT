package HW5;

public class Book {

    private int id;
    private int pages;
    private int price;
    private int dateOfRelease;
    private String title;
    private String author;
    private String binding;
    private String publishingHouse;

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

    public int getPages() {
        return pages;
    }

    public int getPrice() {
        return price;
    }

    public int getDateOfRelease() {
        return dateOfRelease;
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

    public String getBinding() {
        return binding;
    }

    @Override
    public String toString() { // info about formatting:
        // http://study-java.ru/uroki-java/formatirovanie-chisel-i-texta-v-java/
        return String.format(
                "ID: %d\t title: %30s\t author: %13s\t publishingHouse: %s\t dateOfRelease: %d\t pages: %d\t price: %5d\t binding: %s",
                id, title, author, publishingHouse, dateOfRelease, pages, price, binding);
    }

    public static void showAuthor(Book arr[], String nameOfAuthor) {
        for (int i = 0; i < arr.length; i++) {
            if (nameOfAuthor.equals(arr[i].getAuthor())) {
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