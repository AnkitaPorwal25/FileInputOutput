package AdvancedLevel;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class A15CharacterFrequencyCounter {
    public static void main(String[] args) {
        // Check if command-line arguments are provided
        if (args.length < 2) {
            System.out.println("Usage: java CharacterFrequencyCounter <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];  // Input file path from command-line arguments
        String outputFile = args[1]; // Output file path from command-line arguments

        // Read the file and count character frequencies
        Map<Character, Integer> charCountMap = countCharacterFrequencies(inputFile);

        // Write the result to a new file
        writeCharacterCounts(outputFile, charCountMap);
    }

    // Method to count character frequencies
    public static Map<Character, Integer> countCharacterFrequencies(String fileName) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int charValue;
            while ((charValue = reader.read()) != -1) {
                char currentChar = (char) charValue;
                charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + fileName);
            e.printStackTrace();
        }

        return charCountMap;
    }

    // Method to write the character frequencies to a file
    public static void writeCharacterCounts(String outputFile, Map<Character, Integer> charCountMap) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
            System.out.println("Character frequencies have been written to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the result to the file: " + outputFile);
            e.printStackTrace();
        }
    }
}

//
//Write a program that reads a text file and counts the frequency of
//each character (including spaces and punctuation). Print the result to a
//file named charcount.txt.