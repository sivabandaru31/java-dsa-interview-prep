package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackusingQueues225 {
    Queue<Integer> queue1=new LinkedList<>();
    Queue<Integer> queue2=new  LinkedList<>();


    void push(int x){
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        queue1.add(x);
        while(!queue2.isEmpty()){
            queue1.add(queue2.remove());
        }
    }
    int pop() throws Exception{
        if(empty()){
            throw new Exception("can not pop because queue is empty");
        }
        return queue1.remove();
    }
    int peek() throws Exception{
        if(empty()){
            throw new Exception("can not pop because queue is empty");
        }
        return queue1.peek();
    }
    boolean empty(){
        return queue1.isEmpty();
    }

    public static void main(String[] args) throws Exception {
        try {
            StackusingQueues225 queue = new StackusingQueues225();
            queue.push(10);
            queue.push(20);
            queue.push(30);
            queue.push(40);
            System.out.println("remove Element :" + queue.pop());
            System.out.println("remove Element :" + queue.pop());
            System.out.println("remove Element :" + queue.pop());
            System.out.println("remove Element :" + queue.pop());
            System.out.println("remove Element :" + queue.pop());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
