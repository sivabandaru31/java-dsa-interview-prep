package leetCode.LinkedList;

public class LeetCode26 {
    static int RemoveDuplicates(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]) {
                continue;
            }else{
                nums[count]=nums[i];
                count++;

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,2,3,4,5};
        int result= RemoveDuplicates(nums);
        System.out.println(result);
//        for(int i=0;i<result;i++){
//            System.out.println(nums[i]+" ");
//        }


    }
}
