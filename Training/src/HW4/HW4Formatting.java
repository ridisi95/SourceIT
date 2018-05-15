package HW4;

public class HW4Formatting {
	public static void main(String[] args) {

		// System.out.printf("%.1f", Math.PI);
		// System.out.println();
		// System.out.printf("%.2f", Math.PI);
		// System.out.println();
		// System.out.printf("%.3f", Math.PI);
		// System.out.println();
		// System.out.printf("%.4f", Math.PI);
		// System.out.println();
		// System.out.printf("%.5f", Math.PI);

		for (int i = 0; i < 5; i++) {
			System.out.printf("%." + i + "f", Math.PI);
			System.out.println();
		}

	}
}