package gr.aueb.cf.cf9.exercises.ch5.exercise5;

public class FindMax {

    public static void main(String[] args) {
        int a = 54;
        int b = 789;
        int c = 49;

        System.out.printf("max(%d, %d, %d) = %d", a, b, c, findMax(a, b, c));
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
