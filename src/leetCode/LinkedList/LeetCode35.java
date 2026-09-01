package leetCode.LinkedList;

public class LeetCode35 {
    static int Position(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int pos=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>=target){
                pos=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,3,5,6};
        int result=Position(nums,5);
        System.out.println(result);
    }
}
