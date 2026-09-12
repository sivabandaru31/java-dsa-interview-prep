package recursion;

public class BinaraySearchProblems {
    public static int binarysearch(int[] arr,int target,int low,int high){
        int mid=low+(high-low)/2;
        if(low>high){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        else if(mid>target){
           return binarysearch(arr,target,low,mid-1);
        }else{
           return binarysearch(arr,target,mid+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,5,6,7,10,11,15};
      int result=  binarysearch(arr,15,0,arr.length);
        System.out.println(result);

    }
}
