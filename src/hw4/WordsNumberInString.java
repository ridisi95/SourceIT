package hw4;

public class WordsNumberInString {
	public static void getStringLength(String string) {

		String[] arrayWords = string.split("\\s");
		System.out.println(arrayWords.length);
	}

	public static void main(String ... args) {
		getStringLength("Java is one of most popular programming language in the world");
	}
}
