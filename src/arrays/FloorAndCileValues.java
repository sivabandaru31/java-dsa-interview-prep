package arrays;

public class FloorAndCileValues {
    /*static int FindFloorValue(int []arr,int x){
       int floor=-1;
       int ceil=-1;
       for(int i=0;i<arr.length;i++){
           if(arr[i]<=x){
               floor=arr[i];
           }else{
               break;
           }
       }
       return floor;
   }
   static int FindCeilValue(int []arr,int x){
       int ceil=-1;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>=x){
               ceil=arr[i];
           break;
           }
       }
       return ceil;
   }*/
    static int FindFloorValue(int[] arr, int x) {
        int low = 0, high = arr.length, floor = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                floor = arr[mid];
            } else if (arr[mid] <= x) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floor;
    }
    static int FindceilValue(int[] arr, int x) {
        int ceil = -1;
        int low = 0, high = arr.length, floor = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                ceil = arr[mid];
            } else if (arr[mid] >= x) {
                ceil = arr[mid];
                high = mid + -1;
            } else {
                low = mid + 1;
            }
        }
        return ceil;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 7, 8, 10, 15, 18, 20, 25};
        int x = 9;
        int f = FindFloorValue(arr, x);
        if (f != -1) {
            System.out.print(f + " ");
        } else {
            System.out.println("none");

        }
        int c = FindceilValue(arr, x);
        if (c != -1) {
            System.out.print(c + " ");
        } else {
            System.out.println("none");
        }
       /* int f=FindFloorValue(arr,x);
        if(f !=-1) {
            System.out.print(f+" ");
        }else {
            System.out.println("none");
        }
        int c= FindCeilValue(arr,x);
        System.out.println(c+" ");*/
    }

}
