package queue;

public class QueueTwoPointer {
    private int[] queue;
    private int rear,front;
    private int capacity;



    public QueueTwoPointer (int size){
        front=-1;
        rear=-1;
        this.capacity=size;
        this.queue=new int[capacity];
    }
    public void enqueue(int x){

        if(isfull()){
            System.out.println("array is full");
        }
        if(front==-1){
            front++;
        }
        rear++;
        queue[rear]=x;

    }
    boolean isfull(){
//        if(rear==queue.length-1){
//            return true;
//        }
//        return false;
        return  rear==queue.length-1;



    }
    public int dequeue() throws Exception{

        if(isempty()){
            throw new Exception("queue is empty so can not delete");
        }
        if(front==rear){
            int x=queue[front];
            front=-1;
            rear=-1;
            return x;

        }

        int x=queue[front];
        front++;
        return x;

    }


    boolean isempty(){
//        if(rear==-1){
//            return true;
//        }
//        return false;
        return rear==-1 ||front>rear;
    }
    public int peek(){
        int x=queue[front];
        return x;
    }
    public void display(){
        if(isempty()){
            System.out.println("quque is empty");
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
    }
}
