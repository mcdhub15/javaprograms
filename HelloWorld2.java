import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloFromFile {
    public static void main(String[] args) {
        String filename = "greetings.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to open file " + filename);
            e.printStackTrace();
        }
    }
}
