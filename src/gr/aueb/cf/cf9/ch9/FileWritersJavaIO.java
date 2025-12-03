package gr.aueb.cf.cf9.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Demo of file writers in java.io package
 */
public class FileWritersJavaIO {
    public static void main(String[] args) {
        String filePath1 = "C:\\Users\\chris\\IdeaProjects\\CodingFactory9\\src\\gr\\aueb\\cf\\cf9\\ch9\\file.txt";
        String filePath2 = "C:\\Users\\chris\\IdeaProjects\\CodingFactory9\\src\\gr\\aueb\\cf\\cf9\\ch9\\file-ps.txt";
        File file = new File(filePath1);

        try (PrintStream ps = new PrintStream(filePath2)) {
            fileWriter(filePath1);
            bufferedWriter(file);

            //Flexible usage of sayHello() method
            sayHello(System.out);
            sayHello(ps);

        } catch (IOException e) {
            System.out.println("The file wasn't created or some error occured during writing");
        }
    }


    public static void fileWriter(String file) throws IOException {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Hello World!");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void bufferedWriter(File file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8, true))) {
            bw.write("Hello World bf!");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void printStream(String file) throws IOException{
        try (PrintStream ps = new PrintStream(file)) {
            ps.println("Hello World!");
            ps.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void printWriter(String file) throws IOException{
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println("Hello World!");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void sayHello(PrintStream ps) {
        ps.println("Hello Coding!");
    }
}


