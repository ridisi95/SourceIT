package HW4;

public class Square {
	public static void drawSquare(int width, int height) {

		for (int i = 1; i <= width * 2; i++) {
			System.out.print("+");
			if (i == width) {
				for (int j = 1; j < height - 1; j++) {
					System.out.println();
					for (int u = 1; u <= width; u++) {
						if (u == 1 || u == width) {
							System.out.print("+");
						} else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		}
	}

	public static void main(String ... args) {
		drawSquare(5,5);
	}
}
