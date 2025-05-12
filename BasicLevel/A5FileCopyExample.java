package BasicLevel;
import java.io.*;

public class A5FileCopyExample {
    public static void main(String[] args) {
        String sourceFilePath = "src/TextFiles/source.txt";
        String backupFilePath = "src/TextFiles/backup.txt";

        try {
            FileInputStream sourceFile = new FileInputStream(sourceFilePath);
            FileOutputStream backupFile = new FileOutputStream(backupFilePath);

            int byteData;
            while ((byteData = sourceFile.read()) != -1) {
                backupFile.write(byteData);
            }

            sourceFile.close();
            backupFile.close();

            System.out.println("Contents copied from source.txt to backup.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}

//
//Write a program that copies the contents of source.txt to a new
//file called backup.txt.