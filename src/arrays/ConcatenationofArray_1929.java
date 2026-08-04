package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationofArray_1929 {
    public static  void userinput(int[] nums, Scanner sc){
        System.out.println("enter array elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
    }
    public static void concatenationofArray(int[] nums,int[] ans){
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input");
        int n=sc.nextInt();
        int[] nums=new int[n];
        int[] ans=new int[n*2];
        userinput(nums,sc);
        concatenationofArray(nums,ans);

    }
}
