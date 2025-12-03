package gr.aueb.cf.cf9.ch9;

import java.io.*;

/**
 * Demo of Binary Files.
 */
public class BinaryFiles {

    public static void main(String[] args) {
        String inputFile = "C:\\Users\\chris\\IdeaProjects\\CodingFactory9\\src\\gr\\aueb\\cf\\cf9\\ch9\\9. JavaIOv2-v9.pdf";
        String outputFile = "C:\\Users\\chris\\IdeaProjects\\CodingFactory9\\src\\gr\\aueb\\cf\\cf9\\ch9\\9. JavaIOv2-v9-copy.pdf";

        try {
            binaryFileReadWrite(inputFile, outputFile);
        } catch (IOException e) {
            System.out.println("Η αντιγραφή απέτυχε");
        }
    }

    public static void binaryFileReadWrite(String inputFile, String outputFile) throws IOException {
        final int BUFFER_SIZE = 8192; // 8KB
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead = 0;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile))) {

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("File written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
