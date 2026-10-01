package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements_347 {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);

        System.out.println("Top " + k + " Frequent Elements:");
        System.out.println(Arrays.toString(result));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer>[] freq = new ArrayList[nums.length + 1];

        for (int i = 0; i <= nums.length; i++) {
            freq[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int frequency = entry.getValue();
            int number = entry.getKey();

            freq[frequency].add(number);
        }
        int[] res = new int[k];

        int ind = 0;
        for (int i = freq.length - 1; i >= 0; i--) {

            for (int num : freq[i]) {

                res[ind] = num;
                ind++;

                if (ind == k) {
                    return res;
                }
            }
        }

        return res;
    }
}
