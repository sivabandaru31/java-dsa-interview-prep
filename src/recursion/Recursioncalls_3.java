package recursion;

public class Recursioncalls_3 {
    public static int rectree(int n){
        if(n<=1){
            System.out.println("base: "+n);
            return n+1;
        }
        int count=0;
        System.out.println("pre : "+n);
        count+=rectree(n-1);
        System.out.println("in1 : "+n);
        count+=rectree(n-2);
        System.out.println("in2 : "+n);
        count+=rectree(n-3);
        System.out.println("post : "+n);
        return count+3;
    }
    public static void main(String[] args) {
        int n=7;
        int result=rectree(n);
        System.out.println(result);

    }
}
