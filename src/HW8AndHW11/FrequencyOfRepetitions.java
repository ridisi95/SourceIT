package HW8AndHW11;
 
import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Paths;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfRepetitions {

	public static void main(String[] args) throws IOException {

		try (Stream<String> stream = Files.lines(Paths.get("src/HW8AndHW11/smol editor.txt"))) {
			;

			String joined = String.valueOf(
					stream.map(String::valueOf).collect(Collectors.joining("")).toLowerCase().replaceAll("\\W", ""));

			String str = "";
			int countIndex = 0;
			int max = 0;
			int min = 0;
			StringBuilder letterMax = new StringBuilder(" ");
			StringBuilder letterMin = new StringBuilder(" ");

			for (int i = 0; i < joined.length(); i++) {

				if (!str.contains(String.valueOf(joined.charAt(i)))) {
					str += String.valueOf(joined.charAt(i));

					int innerCountMax = 0;
					int innerCountMin = 0;

					for (int j = 0; j < joined.length(); j++) {

						if (str.codePointAt(countIndex) == joined.codePointAt(j)) {

							innerCountMax++;

							if (innerCountMax > max) {
								max = innerCountMax;
								letterMax.deleteCharAt(0);
								letterMax.append(String.valueOf(str.charAt(countIndex)));
							}
						}

						if (str.codePointAt(countIndex) == joined.codePointAt(j)) { 

							innerCountMin++;

							if (innerCountMin == 1 && j == joined.length() - 1) {
								min = innerCountMin;
								letterMin.append(String.valueOf(str.charAt(countIndex)) + " ");
							}
						}

					}
					countIndex++;

				}

			}

			System.out.println(
					"the most rare: " + (char) 34 + letterMin + (char) 34 + " " + "number of repetitions: " + 1);
			System.out.println(
					"the most frequent: " + (char) 34 + letterMax + (char) 34 + " " + "number of repetitions: " + max);

		}
	}
}
