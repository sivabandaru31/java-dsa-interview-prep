package arrays;

import java.util.Scanner;

public class PrintAllArrayElements {
        public static void userinput(int[] arr, Scanner sc){
            System.out.println("EnterArrayElements");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
        }
        public static void  printallArrayElements(int[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] +" ");
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter array size");
            int n=sc.nextInt();
            int[] arr=new int[n];
            userinput(arr,sc);
            printallArrayElements(arr);

        }
}
