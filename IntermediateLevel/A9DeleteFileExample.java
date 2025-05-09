package IntermediateLevel;
import java.io.File;

public class A9DeleteFileExample {
    public static void main(String[] args) {
        String filePath = "src/TextFiles/oldfile.txt";

        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File " + filePath + " deleted successfully.");
            } else {
                System.out.println("Failed to delete the file " + filePath);
            }
        } else {
            System.out.println("The file " + filePath + " does not exist.");
        }
    }
}
