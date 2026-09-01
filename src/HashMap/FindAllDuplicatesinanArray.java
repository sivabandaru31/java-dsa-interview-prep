package HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FindAllDuplicatesinanArray {

    public List<Integer> findDuplicates(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 2) {
                result.add(num);
                map.put(num, 0);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        FindAllDuplicatesinanArray obj =
                new FindAllDuplicatesinanArray();

        List<Integer> result = obj.findDuplicates(nums);
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Duplicates: " + result);
    }
}