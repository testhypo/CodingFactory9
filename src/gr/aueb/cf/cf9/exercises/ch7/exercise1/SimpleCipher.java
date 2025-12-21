package gr.aueb.cf.cf9.exercises.ch7.exercise1;

/**
 * A simple cipher shifting every character by one lexicographically.
 */
public class SimpleCipher {

    public static void main(String[] args) {
        String s = "What is the weather today like?";
        String encrypted = encrypt(s);
        String decrypted = decrypt(encrypted);

        System.out.println(encrypted);
        System.out.println(decrypted);

    }

    public static String encrypt(String s) {
        StringBuilder cipher = new StringBuilder();
        final int KEY = 1;

        for (int ch : s.toCharArray()) {
            cipher.append((char) (ch + KEY));
        }
        return cipher.toString();

    }

    public static String decrypt(String s) {
        StringBuilder cipher = new StringBuilder();
        final int KEY = 1;

        for (int ch : s.toCharArray()) {
            cipher.append((char) (ch - KEY));
        }
        return cipher.toString();
    }
}
