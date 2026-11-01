package leetCode.LinkedList;

import java.util.Arrays;

public class LeetCode_1929 {

    public int[] getConcatenation(int[] nums) {

        int n = nums.length;

        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {

            ans[i] = nums[i];

            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};

        LeetCode_1929 obj = new LeetCode_1929();

        int[] result = obj.getConcatenation(nums);

        System.out.println(Arrays.toString(result));
    }
}