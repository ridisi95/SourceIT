package HW8AndHW11;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.APPEND;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class SmolTextEditor {
	private static StringBuilder scan() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите свой текст: \n");
		StringBuilder textResult = new StringBuilder();

		while (scan.hasNextLine()) {
			
			String textStop = scan.nextLine();
			
			textResult.append(textStop  + "\n");
			
			if( textStop.equals("exit")) {
				break;
			}

		}
		
		return textResult;

	}

	static File file = new File("src/HW8AndHW11/smol editor.txt");
	static Path start = file.toPath();

	private static void writeNio(StringBuilder stringBuilder) throws IOException {
		try {
			Files.write(start, stringBuilder.toString().getBytes(), CREATE, APPEND);
		} catch (IOException e) {
			System.out.println("Do you have a problem?" + e);
		}

	}

	private class Statistics {

		private void showText() throws IOException {

			try (Stream<String> stream = Files.lines(start)) { 
				stream.forEach(System.out::println); 
			}
			System.out.println("Количество символов включая пробелы: " + file.length());

		}

		private void showVowel() throws IOException {

			List<String> lines = Files.readAllLines(start);
			int intervalKeeper = 0;
			int result = 0;

			for (int i = 0; i < lines.size(); i++) {
				int count = 0;

				for (int j = 0; j < lines.get(i).length(); j++) {

					if (lines.get(i).substring(j, j + 1).toLowerCase().matches("[aeiouyаоиеёэыуюя]")) {
						count++;
					}
				}
				if (count > intervalKeeper) {
					intervalKeeper = count;
					result = i + 1;
				}
			}

			System.out.println("№ Строки с наиболешим количеством гласных букв: " + result);
		}

		public void showCountOfWords() throws IOException {

			List<String> lines = Files.readAllLines(start);

			int countWords = 0;

			for (int i = 0; i < lines.size(); i++) {

				if (!lines.get(i).isEmpty()) {

					for (int j = 0; j < lines.get(i).split("\\s").length; j++) {
						countWords++;

					}

				}
			}
			System.out.println("Количество слов в тексте: " + countWords);

		}

	}

	public Statistics createObjectOfStatistics() {
		return new Statistics();
	}

	public static void main(String[] args) throws IOException {

		SmolTextEditor.writeNio(scan());
		SmolTextEditor ste = new SmolTextEditor();
		SmolTextEditor.Statistics stat = ste.createObjectOfStatistics();

		stat.showText();
		stat.showVowel();
		stat.showCountOfWords();

	}

}
