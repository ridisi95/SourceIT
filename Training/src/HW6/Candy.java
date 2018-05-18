package HW6;

import java.util.Comparator;

public abstract class Candy {

	protected String nameOfCandy;
	protected int weight;
	protected int percentOfSugar;

	public int getWeight() {
		return weight;
	}

	public int getPercentOfSugar() {
		return percentOfSugar;
	}

	@Override
	public String toString() { // ink for learn:
								// http://study-java.ru/uroki-java/formatirovanie-chisel-i-texta-v-java/
		return String.format("Name: %s\t Weight: %d\t Persent of sugar: %s\t ", nameOfCandy, weight, percentOfSugar);
	}

	public static final Comparator<Candy> COMPARE_BY_WEIGHT = new Comparator<Candy>() {
		// link for learn comparator for ArrayList
		// https://ru.stackoverflow.com/questions/468248/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0-%D1%81%D0%BF%D0%B8%D1%81%D0%BA%D0%B0-%D0%BF%D0%BE-%D0%BF%D0%BE%D0%BB%D1%8E-%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82%D0%B0
		@Override
		public int compare(Candy candy1, Candy candy2) {
			return candy1.getWeight() - candy2.getWeight();
		}
	};
}
