package gr.aueb.cf.cf9.ch4;

/**
 * prints a shape with stars
 * using a for loop
 */
public class StarsHorizontalApp {

    public static void main(String[] args) {

        // horizontal stars
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
        System.out.println("\n");

        // a block of 10x10 stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 1, 2, 3, ... stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 10, 9, 8, ... stars
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
