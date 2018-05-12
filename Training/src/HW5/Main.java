package HW5;

public class Main {
	public static void main(String args[]) {

		Book hystoryOfUkraine = new Book(1, "Hystory of Ukraine", "V.Svitlichna", "book club", 2004, 420, 150,
				"hard cover");
		Book meAndIt = new Book(2, "Me and It", "Sigmund Freud", "book club", 2014, 480, 500, "ultra hard cover");
		Book english = new Book(3, "English for Technical Students", "D.Kobez", "book club", 2009, 240, 200,
				"integrated binding");
		Book slv = new Book(4, "SLV", "V.Svitlichna", "Unknown", 2015, 800, 1500, "light cover");
		Book lifeOfZuckerberg = new Book(5, "Life of Zuckerberg", "D.Kobez", "Avanta", 2013, 180, 300, "hard cover");
		Book dictations = new Book(6, "Dictations", "D.Kobez", "Unknown", 2000, 160, 100, "light cover");

		Book[] arr = { hystoryOfUkraine, meAndIt, english, slv, lifeOfZuckerberg, dictations };

		Book.showAuthor(arr, "D.Kobez");
		Book.showPublishingHouse(arr, "book club");
		Book.showDateOfRelease(arr, 2010);

	}

}
