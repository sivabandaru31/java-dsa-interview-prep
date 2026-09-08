package Stacks;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    void push(int x){
        stack1.push(x);//case one

        //case two

//        if(stack1.isEmpty()){
//            stack1.push(x);
//            return;
//        }
//        while(!stack1.isEmpty()){
//            stack2.push(stack1.pop());
//        }
//        stack1.push(x);
//        while(!stack2.isEmpty()){
//            stack1.push(stack2.pop());
//        }



    }
    int pop() throws Exception{

        if(empty()){
            throw new Exception(" can't pop because queue is empty");

        }

        if(!stack2.isEmpty()){
            return  stack2.pop();
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int removedelement=stack2.pop();
        return removedelement;
        //case 2

        // return stack1.pop();

        //case 1
//        while(!stack1.isEmpty()){
//            stack2.push(stack1.pop());
//        }
//        int removedelement=stack2.pop();
//        while(!stack2.isEmpty()){
//            stack1.push(stack2.pop());
//        }
//        return removedelement;
    }
    int peek() throws Exception{
//

        if(!stack2.isEmpty()){
            return stack2.peek();
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int peekelement=stack2.pop();
        return peekelement;



    }
    boolean empty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
    void display(){
        for( int element:stack1){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            QueueUsingStacks queue = new QueueUsingStacks();
            queue.push(10);
            queue.push(20);
            queue.push(30);
            queue.display();
            //queue.push(40);
            //System.out.println(queue);
            System.out.println("removed element: " + queue.pop());
            System.out.println("removed element: " + queue.pop());
//            System.out.println("removed element: " + queue.pop());
//            System.out.println("removed element: " + queue.pop());
            System.out.println("peeked element: " + queue.peek());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
