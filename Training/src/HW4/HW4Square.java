package HW4;

public class HW4Square {
	public static void Square(int width, int height) {

		int stop = 0;

		for (int i = 1; i <= width; i++) {
			System.out.print("+");
			stop++;
			if (i == width && stop != width * 2) {
				for (int j = 1; j <= height; j++) {
					System.out.println();
					for (int u = 2; u <= width; u++) {
						if (u == 1 || u == width) {
							System.out.print("+");
						} else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
				i = 0;
			}
		}
	}
}
