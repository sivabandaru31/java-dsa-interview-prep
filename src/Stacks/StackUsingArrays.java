package Stacks;

public class StackUsingArrays {
    protected int[] stackarray;
    protected int top;
    int maxsize;

    public StackUsingArrays(int size){
        maxsize=size;
       stackarray=new int[size];
       top=-1;
   }

   public void push(int item){

        if(isfull()){
          //  System.out.println("Stack is full");
            resize();
        }
        top++;
        stackarray[top]=item;
   }
   boolean isfull(){
//        if(top==stackarray.length-1){
//            return true;
//        }
//        return false;
       return top==stackarray.length-1;
    }

   int pop() throws Exception{
        if(isempty()){
            throw new Exception("Stack is Empty");

        }
        int x=stackarray[top];
        top--;
        return x;
   }
   boolean isempty(){
//        if(top==-1){
//            return true;
//        }
//        return false;
       return top==-1;
   }
   int peek() throws Exception{
        if(isempty()){
            throw new Exception("stack is empty");
        }
        int x=stackarray[top];
        return  x;
   }
   void resize(){
        maxsize=maxsize*2;
        int[] newarray=new int[maxsize];
        for(int i=0;i<stackarray.length;i++){
            newarray[i]=stackarray[i];
        }
        stackarray=newarray;
   }

    public static void main(String[] args) {
        try {
            StackUsingArrays stack= new StackUsingArrays(5);
            stack.push(1);//O(1) time complexity amrtized O(1)
            stack.push(2);//O(1)
            stack.push(3);//O(1)
            stack.push(4);//O(1)
            stack.push(6);//O(1)
            stack.push(6);//O(n)
            stack.push(6);//O(1)
            stack.push(6);//O(1)
            stack.push(6);//O(1)
//            System.out.println(ob.pop());
//            System.out.println(ob.pop());
//            System.out.println(ob.pop());
//            System.out.println(ob.pop());
//            System.out.println(ob.pop());
//            System.out.println(ob.pop());
//            System.out.println(ob.pop());
//            System.out.println(ob.pop());
            while(!stack.isempty()){
                System.out.println(stack.pop());
            }
            System.out.println(stack.peek());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
