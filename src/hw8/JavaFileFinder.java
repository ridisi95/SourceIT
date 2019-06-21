package hw8;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaFileFinder extends SimpleFileVisitor<Path> {
    private final static int MAX_DEPTH = 6;
    private static Path absolutePath = Paths.get(new File("").getAbsolutePath() + "1");

    // --------> Variant 1
    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException {
        if (String.valueOf(path).endsWith(".java") && path.getNameCount() <=
                MAX_DEPTH) {
            System.out.println(path);
        }
        return FileVisitResult.CONTINUE;
    }

    // --------> Variant 2
    private static void showMeThroughStream() throws IOException {
        try (Stream<Path> stream = Files.find(absolutePath, MAX_DEPTH, (path, attr) -> String.valueOf(path).endsWith(".java"))) {
            // about lambda expression https://www.youtube.com/watch?v=jHStUYP1NEg
            String joined = stream.sorted().map(String::valueOf).collect(Collectors.joining("; \n"));
            System.out.println("Found: \n" + joined);
        } catch (IOException e) {
            System.err.println("\n" + "Something went wrong in method : showMeThroughStream" + "\n");
            throw new IOException(e);
        } finally {
            System.out.println("\n" + "Method showMeThroughStream have finished its work" + "\n");
        }
    }

    // learn filters http://pr0java.blogspot.com/2015/06/8.html
    public static void main(String[] args) throws IOException {
        System.out.println("Directory tree starting with " + absolutePath + ":\n");

        // -----> Variant 1
        try {
            Files.walkFileTree(absolutePath, new JavaFileFinder());
        } catch (IOException e) {
            System.err.println("\n" + "Something went wrong in method : showMeThroughStream" + "\n");
            throw new IOException(e);
        } finally {
            System.out.println("\n" + "Method walkFileTree have finished its work" + "\n");
        }

//		showMeThroughStream(); // uncomment to see Variant 2
    }
}
