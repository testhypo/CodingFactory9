package gr.aueb.cf.cf9.ch7;

/**
 * Strings are cached in SCP (String Constant Pull)
 * or Intern Area for efficiency.
 * To be secure, string are immutable.
 */
public class StrImmutable {

    public static void main(String[] args) {
        String str1 = "Coding";
        String str2 = "Coding";

        str2 = "Factory";

        System.out.println(str1);
        System.out.println(str2);
    }
}
