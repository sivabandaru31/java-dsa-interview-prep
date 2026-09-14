package queue;

public class QueueTwoPointerMain {
    public static void main(String[] args) {
        try {
            QueueTwoPointer queue = new QueueTwoPointer(5);
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);
            queue.display();
            System.out.println("\n"+queue.dequeue());
            System.out.println("\n"+queue.dequeue());
            System.out.println("\n"+queue.dequeue());
            System.out.println("\n"+queue.dequeue());
            System.out.println("\n"+queue.dequeue());
            System.out.println("\n"+queue.dequeue());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
