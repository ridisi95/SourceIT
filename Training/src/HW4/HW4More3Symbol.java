package HW4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW4More3Symbol {
	public static String More3Symbol(String yourString) {

		String clearedStart = yourString.replaceAll("\\b...\\b|\\W", " ");

		String clearedEnd = clearedStart.replaceAll("\\b\\s+\\B", "");

		// String [] originalBox = clearedString.split(" ");
		//
		//
		//
		//
		// String[] modBox = new String [originalBox.length];
		//
		// int amount = 0;
		//
		// for(int i = 0; i < originalBox.length; i++)
		// if(originalBox[i].length() > 3){
		// modBox[amount] = originalBox[i];
		// amount++;
		// }
		//
		//
		//
		//// String result = String.toString(modBox);

		return clearedEnd;
	}

}
