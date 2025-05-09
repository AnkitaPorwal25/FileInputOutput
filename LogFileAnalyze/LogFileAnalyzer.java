package LogFileAnalyze;
import java.io.*;
import java.nio.file.*;

public class LogFileAnalyzer {

    public static void main(String[] args) {
        // Hardcoded input and output file paths
        String inputFile = "src/TextFiles/LogFileAnalyze/server.log";  // Input file path
        String outputFile = "src/TextFiles/LogFileAnalyze/summary.txt"; // Output file path

        // Call method to process the log file and generate the report
        processLogFile(inputFile, outputFile);
    }

    /**
     * Processes the log file, analyzes the data, and writes the summary to the output file.
     */
    public static void processLogFile(String inputFile, String outputFile) {
        int totalEntries = 0;
        int errorEntries = 0;
        int warningEntries = 0;

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile))) {
            // Read all lines from the log file
            String line;
            while ((line = reader.readLine()) != null) {
                totalEntries++;

                // Check if the line contains "ERROR" or "WARNING"
                if (line.contains("ERROR")) {
                    errorEntries++;
                } else if (line.contains("WARNING")) {
                    warningEntries++;
                }
            }

            // Write the results to the summary.txt file
            writeSummaryReport(outputFile, totalEntries, errorEntries, warningEntries);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the log file: " + inputFile);
            e.printStackTrace();
        }
    }

    /**
     * Writes the summary report to the specified output file.
     */
    public static void writeSummaryReport(String outputFile, int totalEntries, int errorEntries, int warningEntries) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {
            // Write the report header
            writer.write("Log Summary Report");
            writer.newLine();
            writer.write("------------------");
            writer.newLine();
            writer.write("Total log entries: " + totalEntries);
            writer.newLine();
            writer.write("ERROR entries: " + errorEntries);
            writer.newLine();
            writer.write("WARNING entries: " + warningEntries);
            writer.newLine();

            // Calculate and write the percentage of ERROR and WARNING lines
            if (totalEntries > 0) {
                double errorPercentage = (double) errorEntries / totalEntries * 100;
                double warningPercentage = (double) warningEntries / totalEntries * 100;

                writer.write(String.format("ERROR percentage: %.2f%%", errorPercentage));
                writer.newLine();
                writer.write(String.format("WARNING percentage: %.2f%%", warningPercentage));
                writer.newLine();
            }

            System.out.println("Summary report has been written to: " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the summary report to the file: " + outputFile);
            e.printStackTrace();
        }
    }
}
