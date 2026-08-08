package arrays;
import java.util.Scanner;
public class MaxandMinElements {

        public static int[] input(int n,Scanner scn) {
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }

            return arr;
        }

        public static void display(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        public static int maxElem(int[] arr) {
            int max = -(int) 1e9;

            for (int elem : arr) {
                max = Math.max(elem, max);
            }

            return max;
        }

        public static int minElem(int[] arr) {
            int min = (int) 1e9;

            for (int elem : arr) {
                min = Math.min(elem, min);
            }

            return min;
        }

        public static void main(String[] args) {
             Scanner scn = new Scanner(System.in);
            System.out.println("Enter array size:");
            int n = scn.nextInt();

            System.out.println("Enter array elements:");
            int[] arr = input(n,scn);

            System.out.println("Array elements:");
            display(arr);

            System.out.println("Maximum element: " + maxElem(arr));
            System.out.println("Minimum element: " + minElem(arr));
        }

}
