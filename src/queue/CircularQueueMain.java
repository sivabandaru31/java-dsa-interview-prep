package queue;

public class CircularQueueMain {
    public static void main(String[] args) {
        CirculrQueue queue = new CirculrQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(60);
        queue.display();
        queue.dequeue();
        //queue.display();


    }
}
