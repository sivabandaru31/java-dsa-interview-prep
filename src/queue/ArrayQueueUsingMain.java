package queue;

public class ArrayQueueUsingMain {
    public static void main(String[] args) {
        QueueDemoSinglePointer queue=new QueueDemoSinglePointer(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.qequeue();
        queue.display();
        System.out.println("\n"+queue.qequeue());
        queue.display();
    }
}
