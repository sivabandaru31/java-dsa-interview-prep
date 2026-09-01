package HashMap;

import java.util.HashMap;

public class FirstUniqueCharacterinaString {

    public static int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each character
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "leetcode";

        int result = firstUniqChar(s);

        System.out.println("String: " + s);
        System.out.println("First Unique Character Index: " + result);

        if (result != -1) {
            System.out.println("First Unique Character: " + s.charAt(result));
        } else {
            System.out.println("No unique character found.");
        }
    }
}