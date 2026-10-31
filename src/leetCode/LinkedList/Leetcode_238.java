package leetCode.LinkedList;
import java.util.Arrays;
public class Leetcode_238 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];

        int prefix = 1;

        // Left to Right
        for (int i = 0; i < n; i++) {

            result[i] = prefix;

            prefix = prefix * nums[i];
        }

        int suffix = 1;

        // Right to Left
        for (int i = n - 1; i >= 0; i--) {

            result[i] = result[i] * suffix;

            suffix = suffix * nums[i];
        }

        return result;
    }
}
