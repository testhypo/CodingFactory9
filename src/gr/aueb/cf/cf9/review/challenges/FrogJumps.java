package gr.aueb.cf.cf9.review.challenges;

/**
 * Από ένα συμείο χ, να πάει σε ένα συμείο y
 * όπου κάθε jump είναι jump.
 * Έστω ότι
 * x = 10
 * y = 55
 * jump = 25
 */
public class FrogJumps {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int jump = 3;

        System.out.println(countJumps(x, y, jump));
    }

    public static int countJumps(int x, int y, int jump) {
        return (int) Math.ceil((y - x) / (double) jump);
    }
}
