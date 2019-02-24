package HW4;

public class Square {
	public static void drawSquare(int width, int height) {

		int interrupter = 0;

		for (int i = 1; i <= width; i++) {
			System.out.print("+");
			interrupter++;
			if (i == width && interrupter != width * 2) {
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
				i = 0;
			}
		}
	}

	public static void main(String ... args) {
		drawSquare(10,5);
	}
}
