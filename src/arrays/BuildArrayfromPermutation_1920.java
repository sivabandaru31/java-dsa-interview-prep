package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayfromPermutation_1920 {
    public static void input(int[] nums, Scanner sc){
        System.out.println("enter array elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
    }
    public static int[] buildArrayfromPermutation(int[] nums,int[] ans){

        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] nums=new int[n];
        int[] ans=new int[n];
        input(nums,sc);
        int[] result=buildArrayfromPermutation(nums,ans);
        System.out.println(Arrays.toString(result));
    }
}
