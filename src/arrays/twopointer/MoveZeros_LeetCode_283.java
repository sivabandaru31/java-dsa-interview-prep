package arrays.twopointer;
import java.util.Arrays;
public class MoveZeros_LeetCode_283 {
    public static void moveXeros(int[] arr){
        int n=arr.length;
        int left=0;

        for(int right=0;right<n;right++){
            if(arr[right]!=0){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
       moveXeros(arr);

    }
}
