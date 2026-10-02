package leetCode.LinkedList;

import java.util.Arrays;

public class LeetCode_75 {
    public static void sortColors(int[] nums) {

        int n = nums.length;

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                nums[mid] = nums[low];
                nums[low] = 0;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                nums[mid] = nums[high];
                nums[high] = 2;

                high--;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting: " + Arrays.toString(nums));

        sortColors(nums);

        System.out.println("After sorting:  " + Arrays.toString(nums));
    }
}
