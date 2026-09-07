package recursion;

public class RecursionDemo {
//    static void display(int n){
//        if(n>3){//Base condition
//            return;
//        }
//        System.out.println(n);//recursive call
//        display(n+1);
//    }
//    static void display2(int n){
//        System.out.println(n);
//    }
//    static void display3(int n){
//        System.out.println(n);
//    }
    public static void display(int n){
        if(n>3){
            return;
        }
        System.out.println(n);
        display(n+1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n=1;
        display(n);
//        display2(2);
//        display3(3);
    }
}
