package gr.aueb.cf.cf9.ch9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Demo of file readers in the java.io package.
 */
public class FileReadersJavaIO {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\chris\\IdeaProjects\\CodingFactory9\\src\\gr\\aueb\\cf\\cf9\\ch9\\file.txt");

        try {
            bufferedReader(file);
        } catch (IOException e) {
            System.out.println("The file wasn't created or some error occured during writing");
        }

    }

    // Scanner is useful for primitive types and strings

    public static void fileReader(String file) throws IOException{
        try (FileReader fr = new FileReader(file, StandardCharsets.UTF_8)) { // for java versions < 14
            int bytesRead = 0;

            while ((bytesRead = fr.read()) != -1) { // while not End Of File(EOF: -1)
                System.out.println((char) bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void bufferedReader(File file) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) { // for java versions < 14
            String line;

            while ((line = br.readLine()) != null) { // while not End Of File(EOF: -1)
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
