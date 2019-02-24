package other;

public class Snake {

	int count;

	int Y = 4;
	int X = 6;

	int yMax = Y - 1;
	int yMin;
	int yNow;

	int xMax = X - 1;
	int xMin;
	int xNow;

	int[][] mass = new int[Y][X];

	private Snake innerSnake;

	public static void main(String[] args) {

		Snake snake = new Snake();
		while (!snake.isFinish()) {
			snake.snakeGo();
		}
		snake.showValues();
	}

	private void snakeGo() {

		innerSnake = new Snake();
		
		for (int j = xNow; j < xMax + 1; j++) {
			count++;
			mass[yNow][j] = count;
		}

		if (innerSnake.isFinish(count)) {
			return;
		}

		xNow = xMax;
		xMax--;
		yNow++;

		for (int j = yNow; j < yMax + 1; j++) {
			count++;
			mass[j][xNow] = count;
			yNow++;
		}

		if (innerSnake.isFinish(count)) {
			return;
		}

		yNow = yMax;
		yMax--;
		yMin++;
		xNow--;

		for (int j = xNow; j >= xMin; j--) {
			count++;
			mass[yNow][j] = count;
		}

		if (innerSnake.isFinish(count)) {
			return;
		}

		xNow = xMin;
		xMin++;
		yNow--;

		for (int j = yNow; j >= yMin; j--) {
			count++;
			mass[j][xNow] = count;
		}

		if (innerSnake.isFinish(count)) {
			return;
		}

		yNow = yMin;
		xNow++;

	}

	private boolean isFinish(int count) {
		if (count == Y * X) {
			return true;
		}
		return false;
	}

	private boolean isFinish() {

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}

	private void showValues() {

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println(xMax + " - xMax");
		System.out.println(xMin + " - xMin");
		System.out.println(xNow + " - xNow");

		System.out.println();

		System.out.println(yMax + " - yMax");
		System.out.println(yMin + " - yMin");
		System.out.println(yNow + " - yNow");
	}
}
