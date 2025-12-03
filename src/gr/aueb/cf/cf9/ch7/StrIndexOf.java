package gr.aueb.cf.cf9.ch7;

public class StrIndexOf {

    public static void main(String[] args) {
        String cf = "Coding Factory";
        String fileName = "coding.txt";

        int positionOf_o = cf.indexOf("o"); // 1
        System.out.println(positionOf_o);

        int positionOfNext_o = cf.indexOf("o", 2); // 11
        System.out.println(positionOfNext_o);

        int positionOfLast_o = cf.lastIndexOf("o"); // 11
        System.out.println(positionOfLast_o);

        System.out.println(getExtension(fileName)); // txt
    }

    // Method that returns extension of the name of a file
    public static String getExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}
