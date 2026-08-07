package arrays.TwoDarrays;
import java.util.Scanner;

public class Lec7 {

    public static void input(int[][] arr,Scanner scn) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void display(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void exitPointOfMatrix(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;

        int i = 0;
        int j = 0;
        int dir = 0;

        while (true) {

            dir = (dir + arr[i][j]) % 4;

            // East
            if (dir == 0) {
                j++;
            }

            // South
            else if (dir == 1) {
                i++;
            }

            // West
            else if (dir == 2) {
                j--;
            }

            // North
            else {
                i--;
            }

            if (i < 0) {
                i++;
                break;
            }

            if (j < 0) {
                j++;
                break;
            }

            if (i == n) {
                i--;
                break;
            }

            if (j == m) {
                j--;
                break;
            }
        }

        System.out.println("Exit Point = " + i + " " + j);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = scn.nextInt();

        System.out.print("Enter columns: ");
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter matrix:");

        input(arr,scn);

        System.out.println("\nMatrix:");

        display(arr);

        exitPointOfMatrix(arr);
    }
}
