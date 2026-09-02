package recursion;

public class RecursionDemo {
    static void display(int n){
        if(n>3){//Base condition
            return;
        }
        System.out.println(n);//recursive call
        display(n+1);
    }
//    static void display2(int n){
//        System.out.println(n);
//    }
//    static void display3(int n){
//        System.out.println(n);
//    }

    public static void main(String[] args) {
        display(1);
//        display2(2);
//        display3(3);
    }
}
