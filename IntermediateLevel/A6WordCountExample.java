package IntermediateLevel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A6WordCountExample {
    public static void main(String[] args) {
        String filePath = "src/TextFiles/paragraph.txt";
        String targetWord = "Java";
        int count = 0;

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next();
                // Convert the word to lowercase and check if it matches "java"
                if (word.toLowerCase().equals(targetWord.toLowerCase())) {
                    count++;
                }
            }

            System.out.println("The word 'Java' appeared " + count + " times.");
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + filePath);
            e.printStackTrace();
        }
    }
}

//
//Write a program to read all the words from paragraph.txt and
//count how many times the word "Java" appears.