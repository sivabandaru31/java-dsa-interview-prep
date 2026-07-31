package arrays;
import java.util.Scanner;

public class FindSumOfAllArrayElements {
    public static void userInput(int[] arr,Scanner sc){
        System.out.println("Enter Array Elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static int findSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        userInput(arr,sc);
        int result=findSum(arr);
        System.out.println("Sum of Array Elements: "+result);
        sc.close();
    }
}
