package arrays;
import java.util.Arrays;
public class RotatedArrayLeetCode189 {

        //    static void RotatedARRAY(int[] nums,int target){
//        int n=nums.length;
//        int[] temp=new int[n];
//        for(int i=0;i<nums.length;i++){
//            temp[(i+target)%n]=nums[i];
//        }
//        for(int i=0;i<temp.length;i++){
//            nums[i]=temp[i];
//        }
//    }
        static void ReverseArray(int[] nums,int start,int end){
            int n=nums.length;
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        static void RotatedArray(int[] nums,int k){
            int n=nums.length;
            k=k%n;
            ReverseArray(nums,0,n-1);
            ReverseArray(nums,0,k-1);
            ReverseArray(nums,k,n-1);
        }

        public static void main(String[] args) {
            int[] nums=new int[]{1,2,3,4,5,6,7};
//        RotatedARRAY(nums,3);
//        System.out.println(Arrays.toString(nums));
            //ReverseArray(nums,0,nums.length-1);
            RotatedArray(nums,3);
            System.out.println(Arrays.toString(nums));

        }
    }

