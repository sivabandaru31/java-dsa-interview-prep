package recursion;

import java.util.Scanner;

public class ReturnIndexs {
    public static int[] array(int n, int size, Scanner sc) {
        if (n == 0) {
            return new int[size];
        }
        int[] arr = array(n - 1, size, sc);
        arr[n - 1] = sc.nextInt();

        return arr;
    }

//    public static void printarr(int[] arr, int idx) {
//        if (idx == arr.length) {
//            return;
//        }
//        System.out.print(arr[idx] + " ");
//        printarr(arr, idx + 1);
//    }\

    public static int firstindex(int [] arr,int idx,int k){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==k){
            return idx;
        }
       return firstindex(arr,idx+1,k);

    }
    public static int LastIndex(int[] arr,int idx,int k,int last){
        if(idx==arr.length){
            return last ;
        }
        if(arr[idx]==k){
            last=idx;
        }
      return  LastIndex(arr,idx+1,k,last);

    }
    public static void allIdexes(int[] arr,int idx,int k){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==k){
            System.out.println(idx);
        }
         allIdexes(arr,idx+1,k);
    }

    public static void  countallIdexes(int[] arr,int idx,int count,int k){
        if(idx==arr.length){
            System.out.println("count: "+count);
            return;
        }
        if(arr[idx]==k){
            count++;
        }
        countallIdexes(arr,idx+1,count,k);

    }
    public static void firstandlast( int[] arr,int idx,int k,int first,int last,int count){
        if(idx==arr.length){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(count ==0  && arr[idx]==k ){
            first=idx;
            count++;
        }else{
            if(arr[idx]==k){
                last=idx;
            }
        }
        firstandlast(arr,idx+1,k,first,last,count);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");

        int[] arr = array(n, n, sc);

        System.out.println("Array elements:");

        //printarr(arr, 0);
        int result1=  firstindex(arr,0,2);
        int result2=LastIndex(arr,0,2,0);
        System.out.println("first index: "+result1);
        System.out.println("last index: "+result2);
        System.out.println("All Indexes: ");
        allIdexes(arr,0,2);
//        int result3=allIdexes(arr,0,2);
//        System.out.println("allindixes: "+result3);
        System.out.println("count: ");
        countallIdexes(arr,0,0,2);
        firstandlast(arr,0,2,0,0,0);




    }
}
