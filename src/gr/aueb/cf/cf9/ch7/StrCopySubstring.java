package gr.aueb.cf.cf9.ch7;

/**
 * String copying is done
 * with copying of pointers because
 * strings are immutable.
 */
public class StrCopySubstring {

    public static void main(String[] args) {

        // Copy
        String s1 = "Coding";
        String s2 = s1;

        s2 = "Factory";

        System.out.println(s1);
        System.out.println(s2);

        // Substring
        String s3 = s1.substring(1);  // oding
        String s4 = s1.substring(1, 3);          // od

        traverse(s1);
    }

    // Traverse char-by-char using substring
    public static void traverse(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i+1) + " ");
        }
    }
}
