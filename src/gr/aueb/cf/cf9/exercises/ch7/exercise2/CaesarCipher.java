package gr.aueb.cf.cf9.exercises.ch7.exercise2;

public class CaesarCipher {

    public static void main(String[] args) {
        String s = "What a lovely day it is! Zesty!";
        int key = 6;
        String encrypted = encrypt(s, key);

        System.out.println(encrypted);
        System.out.println(decrypt(encrypted, key));
    }

    public static String encrypt(String s, int key) {
        StringBuilder cipher = new StringBuilder();

        for (int ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                cipher.append((char) ('a' + Math.floorMod(ch + key - 'a', 26)));
            } else if  (ch >= 'A' && ch <= 'Z') {
                cipher.append((char) ('A' + Math.floorMod(ch + key - 'A', 26)));
            } else {
                cipher.append((char) ch);
            }
        }
        return cipher.toString();
    }

    public static String decrypt(String s, int key) {
        StringBuilder cipher = new StringBuilder();

        for (int ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                cipher.append((char) ('a' + Math.floorMod(ch - key - 'a', 26)));
            } else if  (ch >= 'A' && ch <= 'Z') {
                cipher.append((char) ('A' + Math.floorMod(ch - key - 'A', 26)));
            } else {
                cipher.append((char) ch);
            }
        }
        return cipher.toString();
    }
}
