package arrays.slidingWindow;

public class SubarrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int n = nums.length;
        int count = 0;
        int left = 0;
        int product = 1;

        for (int right = 0; right < n; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;

        System.out.println(numSubarrayProductLessThanK(nums, k));
    }
}
