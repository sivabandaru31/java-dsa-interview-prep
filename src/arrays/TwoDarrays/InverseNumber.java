package arrays.TwoDarrays;
import java.util.Scanner;
public class InverseNumber {
    public static void inverseOfNumbers(int n) {

        int inv = 0;
        int orgPos = 1;

        while (n != 0) {

            int orgDig = n % 10;

            int invDig = orgPos;
            int invPos = orgDig;

            inv += invDig * (int) Math.pow(10, invPos - 1);

            n /= 10;
            orgPos++;
        }

        System.out.println("Inverse: " + inv);
    }

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = scn.nextInt();

        inverseOfNumbers(n);
    }
}
