package gr.aueb.cf.cf9.ch7;

/**
 * Traverses a string character-by-character.
 * Not with enhanced for loop, but with classic for loop.
 */
public class StrTraverse {

    public static void main(String[] args) {
        String str = "Coding Factory";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        // print the reversed string

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}
