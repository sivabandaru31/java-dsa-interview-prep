package arrays;

import java.util.Scanner;

public class ReverseNumber {


    public static void reverseOrder(int n , Scanner scn) {

        while (n != 0) {
            int ans = n % 10;
            System.out.print(ans+" ");
            n /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = scn.nextInt();

        reverseOrder(n,scn);
    }
}
