package leetCode.LinkedList;

public class LeetCode_3110 {
    public static void main(String[] args) {

        String s = "hello";

        int result = scoreOfString(s);

        System.out.println(result);
    }

    public static int scoreOfString(String s) {

        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            int diff = s.charAt(i) - s.charAt(i + 1);

            if (diff < 0) {
                diff = -diff;
            }

            sum = sum + diff;
        }

        return sum;
    }
}
