package Strings;

import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String str , Scanner sc){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  String");
        String str=sc.nextLine();
        Boolean result=palindrome(str,sc);
        System.out.println(result);
    }

}
