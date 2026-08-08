package arrays;
import  java.util.Scanner;
public class ForwardNumber {


    public static int power(int n) {

        int pow = 1;

        while (n != 0) {
            n /= 10;
            pow *= 10;
        }

        return pow / 10;
    }

    public static void forwardOrder(int n) {

        int pow = power(n);

        while (n != 0) {

            int ans = n / pow;

            System.out.println(ans);

            n %= pow;
            pow /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = scn.nextInt();

        forwardOrder(n);
    }
}
