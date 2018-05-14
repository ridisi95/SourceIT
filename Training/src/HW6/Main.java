package HW6;

import HW6.Candy;
import java.util.Arrays;



public class Main {
	
	public static void main(String args[]) {
		
	
	
	Cow cow = new Cow();
	Caramel caramel = new Caramel();
	Gelatin gelatin = new Gelatin();
	
	
	
	Gift[] gift = {new Gift((Candy)cow,(Candy)caramel,(Candy)gelatin)};
	
	Gift[] array2 = Arrays.stream(gift).sorted( (candy1, candy2) -> {
		return candy1.getWeight() - candy2.getWeight();
	}).toArray(Gift[]::new);
	
	
	
	
	}
}
