package HW8;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileExpansionOfJava extends SimpleFileVisitor<Path> {
	static int maxDepth = 6;

	private static void showMeThroughStream() throws IOException { // ========= 1
		Path start = Paths.get("C:\\Users\\Smol\\eclipse-workspace");
		try (Stream<Path> stream = Files.find(start, maxDepth,
				(path, attr) -> String.valueOf(path).endsWith(".java"))) {
			String joined = stream.sorted().map(String::valueOf).collect(Collectors.joining("; \n"));
			System.out.println("Found: \n" + joined);
		}
	}

//	public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException { // ========= 2
//		if (String.valueOf(path).endsWith(".java") && path.getNameCount() <= maxDepth) {
//			System.out.println(path);
//		}
//		return FileVisitResult.CONTINUE;
//	}

	// learn filters http://pr0java.blogspot.com/2015/06/8.html
	public static void main(String[] args) throws IOException {
		// FileExpansionOfJava.showMeThroughStream(); // =============== 1

		String dirname = "C:\\Users\\Smol\\eclipse-workspace"; // =============== 2
		System.out.println("Directory tree starting with " + dirname + ":\n");
		try {
			Files.walkFileTree(Paths.get(dirname), new FileExpansionOfJava()); // не понял как работает 2-я форма
																				
		} catch (IOException e) {
			System.out.println("I/O Error");
		}

	}
}
