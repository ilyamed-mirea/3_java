package n23.n1;

public class Tester {
    public static void main(String[] args) {
        ArrayQueueModule queue = new ArrayQueueModule();
        queue.arr = new Object[5];
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.display();
        queue.deQueue();
        queue.deQueue();
        queue.display();
        queue.peek();
        queue.clear();
        queue.display();
    }
}
