package queue;

public class QueueDemoSinglePointer {
    private int[] queue;
    private int rear;
    private int capacity;

    public QueueDemoSinglePointer(int size){
        this.capacity=size;
        rear=-1;
        this.queue=new int[capacity];
        System.out.println(size);
    }
    public void enqueue(int x){
        if(isfull()){
            System.out.println("Array is full");
        }
        rear++;
        queue[rear]=x;
    }
    boolean isfull(){
//        if(rear==queue.length-1) {
//            return true;
//        }
//        return false;

        return rear==queue.length-1;
    }
    public int qequeue(){
        if(isempty()){
            System.out.println();
        }
        int x=queue[0];
        for(int i=1;i<=queue.length-1;i++){
            queue[i-1]=queue[i];
        }
        rear--;
        return x;
    }
    boolean isempty(){
//        if(rear==-1){
//            return true;
//        }
        return rear==-1;
    }
    public void display(){
        for(int i=0;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
    }

//    public static void main(String[] args) {
//       // Queue<Integer> queue=new LinkedList<>();
//       // Queue<Integer> queue=new PriorityQueue<>();
//        Queue<Integer> queue=new ArrayDeque<>();
//        queue.add(10);
//        queue.add(30);
//        queue.add(20);
//        queue.add(2);
//        System.out.println("Queue="+queue);
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());
//        System.out.println(queue.element());
//        System.out.println(queue);
////        System.out.println(queue.remove());
////        System.out.println(queue.remove());
////        System.out.println(queue.remove());
////        System.out.println(queue.poll());
//    }
}
