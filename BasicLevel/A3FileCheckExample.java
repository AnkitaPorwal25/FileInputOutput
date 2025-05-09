package BasicLevel;
import java.io.File;

public class A3FileCheckExample {
    public static void main(String[] args) {
        String filePath = "src/TextFiles/report.pdf";

        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("File found: " + filePath);
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("File not found: " + filePath);
        }
    }
}
