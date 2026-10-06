package arrays.slidingWindow;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {

        int zeroCount = 0;
        int n = nums.length;
        int left = 0;

        for (int right = 0; right < n; right++) {

            if (nums[right] == 0) {
                zeroCount++;
            }

            if (zeroCount > k) {

                if (nums[left] == 0) {
                    zeroCount--;
                }

                left++;
            }
        }

        return n - left;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        int result = longestOnes(nums, k);

        System.out.println("Maximum consecutive ones: " + result);
    }
}
