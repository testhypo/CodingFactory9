package gr.aueb.cf.cf9.ch7;

/**
 * Makes the string lowercase/uppercase.
 */
public class StrUpperLower {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";

        // equalsIgnoreCase() with normalization to uppercase
        boolean isEqual1 = s1.toUpperCase().equals(s2.toUpperCase());
        boolean isEqual2 = s1.toLowerCase().equals(s2.toLowerCase());
    }
}
