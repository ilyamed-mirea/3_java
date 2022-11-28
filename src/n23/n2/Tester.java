package n23.n2;

public class Tester {

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(16);
        queue.enqueue(17);
        queue.enqueue(18);
        queue.enqueue(19);
        queue.enqueue(20);
        queue.enqueue(21);
        queue.enqueue(22);
        queue.enqueue(23);
        queue.enqueue(24);
        queue.enqueue(25);
        queue.enqueue(26);
        queue.enqueue(27);
        queue.enqueue(28);
        queue.enqueue(29);
        queue.enqueue(30);
        queue.enqueue(31);
        queue.enqueue(32);
        queue.enqueue(33);
        queue.enqueue(34);
        queue.enqueue(35);
        queue.enqueue(36);
        queue.enqueue(37);
        queue.enqueue(38);
        queue.enqueue(39);
        queue.enqueue(40);
        //print
        Object[] arr = queue.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //dequeue
        for (int i = 0; i < 10; i++) {
            queue.dequeue();
        }
        //print
        arr = queue.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //element
        System.out.println(queue.element());
        //clear
        queue.clear();
        //print
        arr = queue.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
