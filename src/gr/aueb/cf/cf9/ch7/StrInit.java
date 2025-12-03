package gr.aueb.cf.cf9.ch7;

/**
 * Initialization (populate) of {@link String}.
 */
public class StrInit {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = new String("Athens");
        String s3 = "";
        String s4 = null;
        boolean isEmpty;

//        isEmpty = s3.length() == 0;
        isEmpty = s3.isEmpty();

        System.out.println(s1);
        System.out.println("Length: " + s1.length());
        System.out.printf("City: %s\n", s1);
    }
}
