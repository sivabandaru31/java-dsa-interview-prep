package recursion;

import java.util.Scanner;

public class PrintArrayUsingRecurssion {
    public static int[] array(int n, int size, Scanner sc) {
        if (n == 0) {
            return new int[size];
        }
        int[] arr = array(n - 1, size, sc);
        arr[n - 1] = sc.nextInt();

        return arr;
    }

    public static void printarr(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.print(arr[idx] + " ");
        printarr(arr, idx + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");

        int[] arr = array(n, n, sc);

        System.out.println("Array elements:");

        printarr(arr, 0);
    }
}
