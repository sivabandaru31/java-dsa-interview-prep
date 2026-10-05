package arrays.slidingWindow;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums,int k) {

//        int currentSum = nums[0];
//        int maxSum = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//
//            currentSum = Math.max(nums[i], currentSum + nums[i]);
//
//            maxSum = Math.max(maxSum, currentSum);
//        }
//
//        return maxSum;

        //using Sliding Window pattern
        int n = nums.length;

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < n; i++) {

            windowSum += nums[i];       // add new element
            windowSum -= nums[i - k];   // remove old element

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;

    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums,4);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}
