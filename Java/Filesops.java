import java.io.FileWriter;
import java.io.IOException;

public class Filesops {
    public static void main(String[] args) {
        String path = "D:/ISS assignment to old laptop/Java/myfile.txt";
        String content = "My name is Chirag";

        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("File created and content written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
