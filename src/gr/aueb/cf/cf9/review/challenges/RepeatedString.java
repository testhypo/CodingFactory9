package gr.aueb.cf.cf9.review.challenges;

public class RepeatedString {

    public static void main(String[] args) {
        String str = "repeat ";
        int num = 7;

        System.out.println(repeatString(str, num));
    }

    public static String repeatString(String str, int num) {
        if (str == null || str.isBlank()) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
