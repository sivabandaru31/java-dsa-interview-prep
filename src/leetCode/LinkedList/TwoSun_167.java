package leetCode.LinkedList;
import java.util.Arrays;
public class TwoSun_167 {
    public static int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }

            if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Target: " + target);
        System.out.println("Answer: " + Arrays.toString(result));
    }
}
