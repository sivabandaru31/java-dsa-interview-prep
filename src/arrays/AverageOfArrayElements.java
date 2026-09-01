package arrays;
import java.util.Scanner;
public class AverageOfArrayElements {
    public static void input(int[] arr,Scanner sc){
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static double calculateaverage(int[] arr){
        int sum=0;
        //int count=0;
        for(int i=0;i<arr.length;i++){
            //count++;
            sum+=arr[i];
        }
        return (double)sum/arr.length;
        // System.out.println("Average: "+average);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        input(arr,sc);
        double average=calculateaverage(arr);
        System.out.printf("%.2f",average);
    }
}
