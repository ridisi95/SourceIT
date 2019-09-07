package hw4;

public class Formatting {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.printf("%." + i + "f", Math.PI);
			System.out.println();
		}

	}
}