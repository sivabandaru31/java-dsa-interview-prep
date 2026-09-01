package leetCode.LinkedList.Strings;

public class Stringpalindrome {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("nnnnnnnnn");
        int left=0,right=str.length()-1;
        boolean  ispalindrome=true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                ispalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(!ispalindrome){
            System.out.println("String is not palindrome");
        }else{
            System.out.println("String is palindrome");
        }
    }
}
