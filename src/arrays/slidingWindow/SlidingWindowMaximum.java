package arrays.slidingWindow;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Deque;
public class SlidingWindowMaximum {

    public static int[]  maxSlidingWindow(int[] nums ,int k){

        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.addLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;

    }
    public static void main(String[] args) {

        //BrutForce Approch
//        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
//        int n = nums.length;
//        int k = 3;
//        int[] result = new int[n - k + 1];
//        for (int i = 0; i < n - 2; i++) {
//            int max = 0;
//            for (int j = i; j < k + i; j++) {
//                if (nums[j] > max) {
//                    max = nums[j];
//                }
//            }
//            result[i] = max;
//
//        }
//        System.out.println(Arrays.toString(result));

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result=maxSlidingWindow(nums,k);
        System.out.println(Arrays.toString(result));
    }
}
