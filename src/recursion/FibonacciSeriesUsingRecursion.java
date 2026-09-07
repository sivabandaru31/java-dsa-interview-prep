package recursion;

public class FibonacciSeriesUsingRecursion {
    public static int fibonacciseries(int n){
        if(n<=1){
            return n;
        }

        return fibonacciseries (n-1)+fibonacciseries(n-2);

    }
    public static void main(String[] args) {
        int n=5;
        int result=fibonacciseries(n);
        System.out.println(result);
    }
}
