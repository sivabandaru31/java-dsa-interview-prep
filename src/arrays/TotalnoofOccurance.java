package arrays;

public class TotalnoofOccurance {
    static int ElementOccuranc(int []arr,int target){
        /*int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;*/
        int count =0;
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                count++;
                high=mid;
            }else if(arr[mid]>target){
                high=mid+1;
            }else{
                low=mid-1;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,1,1,2,2,3,3};
        int target =1;
        int result=ElementOccuranc(arr,target);
        System.out.println(result);

        /*for(int i=0;i<arr.length-1;i++){
            if(arr[i]==1){
                count++;
            }

        }
        System.out.println(count);*/

    }
}
