package HW4;

public class HW4MaxValueofArray {
	public static int Mymethods(int somearr[]) {

		int max = 0;

		for (int i = 0; i < somearr.length; i++) {
			if (somearr[i] > max) {
				max = somearr[i];
			}
		}
		return max;
	}
}
