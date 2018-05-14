package HW6;

import java.util.Arrays;

import HW6.Candy;




public class Gift {
	
	public Gift(Candy cow, Candy caramel, Candy gelatin) {
		// TODO Auto-generated constructor stub
	}

	public static Gift[] putInGift(Candy candy1, Candy candy2, Candy candy3) {

		Gift[] gift = {new Gift((Candy)candy1,(Candy)candy2,(Candy)candy3)};
		
		Gift[] array2 = Arrays.stream(gift).sorted( (candy1, candy2) -> {
			return candy1.getWeight() - candy2.getWeight();
		}).toArray(Gift[]::new);

		
		
		
		
		
		
		
		
		
		
		
		// Candy[] gift = { candy1, candy2, candy3 };
		//
		// for (int i = 0; i < 3; i++) {
		// for (int j = 1; j < i; j++) {
		//
		// if (gift[i].getWeight() < (gift[j].getWeight())) {
		//
		// }
		//
		// }
		//
		// }
		//
		// return gift;
	}

}
