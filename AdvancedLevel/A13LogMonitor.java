package AdvancedLevel;
import java.io.*;

public class A13LogMonitor {
    public static void main(String[] args) {
        String filePath = "src/TextFiles/server.log";

        File logFile = new File(filePath);

        try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
            String line;
            System.out.println("Monitoring log for 'ERROR' entries...\n");

            // Keep reading the file line by line
            while ((line = reader.readLine()) != null) {
                if (line.contains("ERROR")) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the log file.");
            e.printStackTrace();
        }
    }
}
