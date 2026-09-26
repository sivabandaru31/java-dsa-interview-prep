package arrays;

public class CognigantTest {
    public static boolean armstrongNumber(int num){
        int result=0;
        int original=num;
        while(num>0){
            int temp=num%10;
            num=num/10;
            result+=temp*temp*temp;
        }
        if(result!=original){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int num=153;
        boolean result=armstrongNumber(num);
        System.out.println(result);
    }
}
