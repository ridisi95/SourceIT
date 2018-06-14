package HW8;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLetterToUp {
	public static void main(String[] args) {

		String string = "When I was younger \nI never needed\n";

		Pattern pattern = Pattern.compile("\\b[a-z]\\B");

		Matcher matcher = pattern.matcher(string);

		while (matcher.find()) {

			string = string.replaceFirst(pattern.toString(), matcher.group().toUpperCase());

		}

		System.out.println(string);

	}

}
