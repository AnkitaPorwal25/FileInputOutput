package IntermediateLevel;
import java.io.File;

public class A10ListFilesAndDirectoriesExample {
    public static void main(String[] args) {
        String directoryPath = "src/TextFiles/documents"; // specify the folder path
        //      String directoryPath = "src/TextFiles"; // specify the folder path

        File folder = new File(directoryPath);

        // Check if the directory exists and is indeed a directory
        if (folder.exists() && folder.isDirectory()) {
            String[] filesAndDirs = folder.list();

            if (filesAndDirs != null) {
                System.out.println("Files and directories in " + directoryPath + ":");
                for (String fileOrDir : filesAndDirs) {
                    System.out.println(fileOrDir);
                }
            } else {
                System.out.println("Failed to list the contents of " + directoryPath);
            }
        } else {
            System.out.println("The directory " + directoryPath + " does not exist.");
        }
    }
}
