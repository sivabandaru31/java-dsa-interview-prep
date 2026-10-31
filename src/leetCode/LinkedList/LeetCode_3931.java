package leetCode.LinkedList;

public class LeetCode_3931 {
    public static void main(String[] args) {

        String s = "132";

        boolean result = isAdjacentDiffAtMostTwo(s);

        System.out.println(result);
    }

    public static boolean isAdjacentDiffAtMostTwo(String s) {

        for (int i = 1; i < s.length(); i++) {

            int diff = s.charAt(i) - s.charAt(i - 1);

            if (diff < 0) {
                diff = -diff;
            }

            if (diff > 2) {
                return false;
            }
        }

        return true;
    }
}
