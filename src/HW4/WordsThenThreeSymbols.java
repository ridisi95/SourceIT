package HW4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordsThenThreeSymbols {

	public static String[] getWordsMoreThenThreeSymbols(String[] string) {
		List<String> listString = Arrays.asList(string);
		List<String> result = listString.stream().filter(x -> x.length() > 3).collect(Collectors.toList());

		return result.toArray(new String[result.size()]);
	}

	public static void main(String ... args) {
		String[] string = {"Java", "11", "was", "released", "on", "2018", "year"};

		System.out.println("Before using method: " + Arrays.toString(string));
		String[] resultArray = getWordsMoreThenThreeSymbols(string);
		System.out.println("After using method: " + Arrays.toString(resultArray));
	}
}
