package HW5;

public class Books {

	int id;
	String title;
	String author;
	String publishingHouse;
	int dateOfRelease;
	int pages;
	int price;
	String binding;
	
	public static void conclusion(Books mass[]) {
		
		for(int i = 0; i < mass.length; i++) {
			
			System.out.println(mass[i].id);
			System.out.println(mass[i].title);
			System.out.println(mass[i].author);
			System.out.println(mass[i].publishingHouse);
			System.out.println(mass[i].dateOfRelease);
			System.out.println(mass[i].pages);
			System.out.println(mass[i].price);
			System.out.println(mass[i].binding);
			System.out.println();
		
			
//			for(int j = 0; j < 8; j++) {
//				switch()
//			}
			
		}
		
		
	}

	public Books(int id, String title, String author, String publishingHouse, int dateOfRelease, int pages, int price,
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

	public static void main(String args[]) {

		Books hystoryOfUkraine = new Books(1, "Hystory of Ukraine", "V.Svitlichna", "Caravela", 2004, 420, 150,
				"hard cover");
		Books meAndIt = new Books(2, "Me and It", "Sigmund Freud", "book club", 2014, 480, 500, "ultra hard cover");
		Books english = new Books(3, "English for Technical Students", "O.Lazareva", "NTU KPI", 2009, 240, 200,
				"integrated binding");
		Books slv = new Books(4, "SLV", "Unknown", "SLV companyÛ", 2015, 800, 1500, "light cover");
		Books lifeOfZuckerberg = new Books(5, "Life of Zuckerberg", "George Bim", "Avanta", 2013, 180, 300,
				"hard cover");
		Books dictations = new Books(6, "Dictations", "D.Kobez", "Ranez", 2000, 160, 100, "light cover");

		Books[] arr = { hystoryOfUkraine, meAndIt, english, slv, lifeOfZuckerberg, dictations };
		
		Books.conclusion(arr);
		
		
	}
}