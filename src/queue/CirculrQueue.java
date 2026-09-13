package queue;

public class CirculrQueue {
    private int[] queue;
    private int rear,front;
    //int capacity;
    private int n;

    public CirculrQueue(int size){
        this.n=size;
        front=-1;
        rear=-1;
//        this.capacity=size;
        this.queue=new int[n];
    }
    public void enqueue(int x) {
        if(isfull()){
            System.out.println("queue is full so can't insert");
        }
        if(front==-1 && rear==-1){
            front++;
            rear++;
        }
        rear=(rear+1)%n;
        queue[rear]=x;
    }
    boolean isfull(){
//        if(rear==queue.length-1){
//            return true;
//        }
//        return false;
        if(((rear+1)%n)==front){
            return true;
        }
        return false;
    }
    public int dequeue(){
        if(isempty()){
            System.out.println("is empty can't perform");
            if(front==rear){
                front=-1;
                rear=-1;

            }else{
                front=(front+1)%n;
            }

        }
        int x=queue[front];
        return x;
//        if(front==rear){
//            int x=queue[front];
//            front=-1;
//            rear=-1;
//            return x;
//        }

//        front=(front+1)%n;
//        return x;
    }
    boolean isempty(){
        if(rear==-1 && front==-1){
            return true;
        }
        return false;

    }
    public void display(){
        if(isempty()){
            System.out.println("queue is empty");
        }
        int i=front;
        while(i!=rear){
            System.out.println(queue[i]+" ");
            i=(i+1)%n;
        }
        System.out.println(queue[rear]);
    }
}
