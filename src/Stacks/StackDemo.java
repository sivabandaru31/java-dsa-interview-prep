package Stacks;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //Stack<Integer> stack=new Stack<>();
        Stack<Object> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push("sivakrishna");
        stack.push("java");
//        System.out.println(stack.size());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}
