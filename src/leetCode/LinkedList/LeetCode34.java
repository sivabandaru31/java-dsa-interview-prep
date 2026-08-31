package leetCode.LinkedList;
import java.util.Arrays;
public class LeetCode34 {



        //BrutForceApproch
//    static int[] FirstANDLastPosition(int[] arr,int target){
//        int[] result={-1,-1};
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]==target){
//                if(result[0]==-1){
//                    result[0]=i;
//                }
//                result[1]=i;
//            }
//        }
//        return result;
//    }
        static int StartingPosition(int[] arr,int key){
            int low=0;
            int high=arr.length-1;
            int first=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]==key){
                    first=mid;
                    high=mid-1;
                }else if(arr[mid]>key){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            return first;

        }
        static int EndPosition(int[] arr,int key){
            int low=0;
            int high=arr.length-1;
            int last=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]== key){
                    last=mid;
                    low=mid+1;
                }else if(arr[mid]<key){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
                //return high;
            }
            return last;
        }


        static int SearchPosition(int[] arr,int target,Boolean findfirstPosition){
            int low=0,high=arr.length-1;
            //int high=arr.length-1;
            int pos=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]>target){
                    high=mid-1;
                }
                else if(arr[mid]<target){
                    low=mid+1;
                }
                else{
                    pos=mid;
                    if(findfirstPosition){
                        high=mid-1;
                    }else{
                        low=mid+1;
                    }
                }
            }
            return pos;
        }
        static int[] firstandlastpositions(int[] arr,int key){
            int[] result3={-1,-1};
            int first= StartingPosition(arr,key);
            if(first==-1){
                return new int[] {-1,-1};
            }
            return new int[] {first,EndPosition(arr,key)};
            //int last= EndPosition(arr,target);
//        int[] result3={-1,-1};
//        int first=SearchPosition(arr,8,true);
//        if(first==-1){
//            return result3;
//        }
//        int last=SearchPosition(arr,8,false);
//        result3[0]=first;
//        result3[1]=last;
//        return result3;


        }

        public static void main(String[] args) {
            int[] arr=new int[] {5,7,7,8,8,8,8,8,8,10};
            int target=8;
//        int result1= StartingPosition(arr,8);
//        int result2=EndPosition(arr,8);
            int[] result=firstandlastpositions(arr,20);
            System.out.println(Arrays.toString(result));





//       int result1= StartingPosition(arr,8);
//       if(result1 !=-1){
//           System.out.println(result1);
//       }else{
//           System.out.println(-1);
//       }
//       int result2=EndPosition(arr,8);
//        if(result2 !=-1){
//            System.out.println(result2);
//        }else{
//            System.out.println(-1);
//        }


//      int[] ans=FirstANDLastPosition(arr,20);
//        System.out.println(Arrays.toString(ans));
        }
    }

