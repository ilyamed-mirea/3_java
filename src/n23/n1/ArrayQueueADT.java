package n23.n1;

public class ArrayQueueADT {
    private static Object[] arr;
    private static int size;
    private static int head;
    private static int tail;

    ArrayQueueADT() {
        head = -1;
        tail = -1;
    }

    // check if the queue is full
    boolean isFull() {
        return head == 0 && tail == arr.length - 1;
    }

    // check if the queue is empty
    boolean isEmpty() {
        return head == -1;
    }

    // insert elements to the queue
    <N> void enQueue(N element) {
        // if queue is full
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (head == -1) {
                // mark front denote first element of queue
                head = 0;
            }
            tail++;
            // insert element at the rear
            arr[tail] = element;
            System.out.println("Insert " + element);
        }
    }
    // delete element from the queue
    <N> N deQueue() {
        N element;
        // if queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        else {
            // remove element from the front of queue
            element = (N) arr[head];
            // if the queue has only one element
            if (head >= tail) {
                head = -1;
                tail = -1;
            }
            else {
                // mark next element as the front
                head++;
            }
            System.out.println("Deleted -> " + element);
            return (N) element;
        }
    }
    // display element at the front of the queue
    <N> N peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        else {
            System.out.println("Element at the front of the queue: " + arr[head]);
            return (N) arr[head];
        }
    }
    // display all the elements of the queue
    <N> void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Elements in the queue are: ");
            for (int i = head; i <= tail; i++) {
                System.out.println(arr[i]);
            }}}

    // get size of the queue
    int size() {
        return tail - head + 1;
    }

    public static void main(String[] args) {
        ArrayQueueADT queue = new ArrayQueueADT();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.display();
        queue.deQueue();
        queue.display();
        queue.peek();
        System.out.println("Size of the queue is: " + queue.size());
    }
}
