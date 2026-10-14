package leetCode.LinkedList;
import java.util.Scanner;
public class LeetCode_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Solution obj = new Solution();
        double result = obj.myPow(x, n);

        System.out.println("Result: " + result);

        sc.close();
    }
}

class Solution {

    public double myPow(double x, int n) {
        long N = n;

        double result = helper(x, Math.abs(N));

        if (n < 0) {
            return 1 / result;
        } else {
            return result;
        }
    }

    double helper(double x, long n) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return helper(x * x, n / 2);
        } else {
            return x * helper(x * x, (n - 1) / 2);
        }
    }
}
