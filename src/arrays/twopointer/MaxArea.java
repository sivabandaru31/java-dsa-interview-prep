package arrays.twopointer;

public class MaxArea {
    public static int maxArea(int[] height) {

        int n = height.length;

        int left = 0;
        int right = n - 1;

        int maxArea = 0;

        while (left < right) {

            int h = Math.min(height[left], height[right]);
            int width = right - left;

            int area = h * width;

            maxArea = Math.max(maxArea, area);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int result = maxArea(height);

        System.out.println("Maximum Area = " + result);
    }

}
