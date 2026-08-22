package Stacks;

public class StackUsingLinkedList {
    private Node top;
    public StackUsingLinkedList(){
        this.top=null;
    }

    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
    }
    public int pop() throws Exception{
        if(isempty()){
            throw new Exception("can't pop list is empty");
        }
        int x=top.data;
        top=top.next;
        return x;
    }
    boolean isempty(){
        return top==null;
    }
    int peek() throws Exception{
        if(isempty()){
            throw new Exception("can't have peek element list is empty");
        }
//        int x=top.data;
//        return x;
        return  top.data;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack=new StackUsingLinkedList();
        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            while(!stack.isempty()){
                System.out.println(stack.pop());
            }
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
            //System.out.println(stack.peek());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
        }catch(Exception e){
            System.out.println(e);
            //e.printStackTrace();
        }
    }
}
