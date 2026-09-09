package recursion;

import java.util.Scanner;

public class MaximumElmentInArray {

    public static int[] array(int n,int val,Scanner sc){
        if(n==0){
            return new int[val];
        }
        int[] arr=array(n-1,val,sc);
        arr[n-1]=sc.nextInt();
        return arr;
    }

    public static int max(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int max=max(arr,idx+1);
        if(arr[idx]>max){
            return arr[idx];
        }
        return  max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
       int[] arr= array(n,n,sc);
        int result=max(arr,0);
        System.out.println("maxElement: "+ result);

    }

}