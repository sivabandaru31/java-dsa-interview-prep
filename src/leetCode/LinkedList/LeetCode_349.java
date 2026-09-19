package leetCode.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class LeetCode_349 {
    public static int[] intersectionelements(int[] nums1,int[] nums2){
        //brutforce approch
//        Set<Integer> set=new HashSet<>();
//        for(int i=0;i<nums1.length;i++){
//            for(int j=0;j<nums2.length;j++){
//                if(nums1[i]==nums2[j]){
//                    set.add(nums1[i]);
//
//                }
//            }
//        }
//        int[] result=new int[set.size()];
//        int index=0;
//        for(int num:set){
//            result[index++]=num;
//        }
//        return result;
        //sorting + Two pointer Approch
//        HashSet<Integer> set=new HashSet<>();
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int i=0;
//        int j=0;
//
//        while(i<nums1.length && j<nums2.length){
//            if(nums1[i]==nums2[j]){
//                set.add(nums1[i]);
//                i++;j++;
//            }
//            else if(nums1[i]<nums2[j]){
//                i++;
//            }else{
//                j++;
//            }
//        }
//        int[] result=new int[set.size()];
//        int index=0;
//        for(int num:set){
//            result[index++]=num;
//        }
//        return result;

        //optimal approch


        HashSet<Integer> set=new HashSet<>();

        for(int num:nums1){
            set.add(num);
        }
        HashSet<Integer> result=new HashSet<>();
        for(int num:nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        int[] result1=new int[set.size()];
        int index=0;
        for(int num:set){
            result1[index++]=num;
        }
        return result1;


    }
    public static void main(String[] args) {
        int[]nums1={1,2,2,1};
        int[] nums2={2,2,1};
        int[] ans=intersectionelements(nums1,nums2);
        System.out.println(Arrays.toString(ans));

    }
}
