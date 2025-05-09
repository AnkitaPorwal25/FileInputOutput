package AdvancedLevel;
import java.io.*;

public class A12MergeTextFilesExample {
    public static void main(String[] args) {
        String folderPath = "src/TextFiles";
        String mergedFilePath = "src/TextFiles/merged.txt";

        File folder = new File(folderPath);
        File mergedFile = new File(mergedFilePath);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile))) {
            File[] txtFiles = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

            if (txtFiles != null) {
                for (File file : txtFiles) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            writer.write(line);
                            writer.newLine();
                        }
                        writer.newLine(); // Add an extra newline between files
                    }
                }
                System.out.println("All .txt files merged into: " + mergedFilePath);
            } else {
                System.out.println("No .txt files found in the specified folder.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred during merging.");
            e.printStackTrace();
        }
    }
}
