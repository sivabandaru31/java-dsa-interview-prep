package recursion;

import java.util.Scanner;

public class ReturnFirstIndex {
    public static int[] array(int n, int size, Scanner sc) {
        if (n == 0) {
            return new int[size];
        }
        int[] arr = array(n - 1, size, sc);
        arr[n - 1] = sc.nextInt();

        return arr;
    }

//    public static void printarr(int[] arr, int idx) {
//        if (idx == arr.length) {
//            return;
//        }
//        System.out.print(arr[idx] + " ");
//        printarr(arr, idx + 1);
//    }\

    public static int firstindex(int [] arr,int idx){
        return idx;
    }
    public static int LastIndex(int[] arr){
        return arr.length;
    }
    public static void allIdexes(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(idx+" ");
        allIdexes(arr,idx+1);
       // return idx;
    }

    public static int  countallIdexes(int[] arr,int idx){
        if(idx==arr.length){
            return 0 ;
        }
       int count= countallIdexes(arr,idx+1);
        return count+1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");

        int[] arr = array(n, n, sc);

        System.out.println("Array elements:");

        //printarr(arr, 0);
        int result1=  firstindex(arr,0);
        int result2=LastIndex(arr);
        System.out.println("first index: "+result1);
        System.out.println("last index: "+result2);
        System.out.println("All Indexes: ");
        allIdexes(arr,0);
        System.out.println("count: ");
        int result4=countallIdexes(arr,0);
        System.out.println("count: "+result4);



    }
}
