import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {

    public static void main(String[] args) {
        try {
            // Create a new instance of BufferedWriter
            BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"));

            // Write the text, "This is the first line"
            bw.write("This is the first line");

            // Add a new line
            bw.newLine();

            // Write the second line of text, "This is the second line"
            bw.write("This is the second line"); 
            
            bw.close();

            // Create a new instance of BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("note.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}