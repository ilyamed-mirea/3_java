package n23.n1;

public class ArrayQueueModule {
    //implemets queue using array
    static Object[] arr;
    private static int size;
    private static int head;
    private static int tail;

    ArrayQueueModule() {
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
            System.out.println( element + " Deleted");
            return (element);
        }
    }

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

    //clear
    void clear() {
        head = -1;
        tail = -1;
        System.out.println("Queue is cleared");
    }

    // display element of the queue
    void display() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            // display the front of the queue
            System.out.println("\nFront index-> " + head);
            // display element of the queue
            System.out.println("Items -> ");
            for (int i = head; i <= tail; i++)
                System.out.print(arr[i] + " ");
            // display the rear of the queue
            System.out.println("\nRear index-> " + tail);
        }
    }
}
