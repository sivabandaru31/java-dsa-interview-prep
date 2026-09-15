package leetCode.LinkedList;
import java.util.ArrayList;

public class Leetcode_412 {
    public static void main(String[] args) {
        ArrayList<String> result=new ArrayList<>();
        for(int i=1;i<=15;i++){
            if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            }else if(i%3==0){
                result.add("Fizz");
            }else if(i%5==0){
                result.add("Buzz");
            }else {
                result.add(i+"");
            }
        }
        System.out.println(result);
    }
}
