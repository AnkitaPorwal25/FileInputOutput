package AdvancedLevel;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class A14NIOFileCopyExample {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("src/TextFiles/nio_input.txt");
        Path destinationPath = Paths.get("src/TextFiles/nio_output.txt");

        try {
            // Read all lines from the source file
            List<String> lines = Files.readAllLines(sourcePath);

            // Write all lines to the destination file
            Files.write(destinationPath, lines);

            System.out.println("File copied successfully using NIO.");
        } catch (IOException e) {
            System.out.println("An error occurred during file I/O:");
            e.printStackTrace();
        }
    }
}
