package HW6;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String args[]) {

		Candy cow = new Cow("cow", 7, 90);
		Candy gelatin = new Gelatin("gelatin", 4, 50);
		Candy caramel = new Caramel("caramel", 5, 75);

		ArrayList<Candy> gift = new ArrayList<Candy>(); // link for learn ArrayList :
														// https://www.youtube.com/watch?v=fRIrhagBCMc
		gift.add(cow);
		gift.add(gelatin);
		gift.add(caramel);

		Collections.sort(gift, Candy.COMPARE_BY_WEIGHT);

		Gift.howMutchWeighGift(gift);

		Gift.showMeCandyWithThisSugarPerecent(gift, 90);

//		Gift.showMeontentGift(gift);

	}
}