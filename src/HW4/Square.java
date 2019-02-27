package HW4;

public class Square {
	public static void drawSquare(int width, int height) {

		width -= 1;
		height -= 2;

		for (int i = 0; i < (width + 1) * 2; i++) {
			System.out.print("+");
			if (i == width) {
				for (int j = 0; j < height; j++) {
					System.out.println();
					for (int u = 0; u <= width; u++) {
						if (u == 0 || u == width) {
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
		drawSquare(5,7);
	}
}
