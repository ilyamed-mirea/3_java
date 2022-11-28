package n23.n2;

public class LinkedQueue implements Queue {
    private Node head;
    private Node tail;
    private int size;

    // Pre: true
    // Post: R = size && size' = size && head' = head && tail' = tail
    public int size() {
        return size;
    }

    // Pre: true
    // Post: R = (size == 0) && size' = size && head' = head && tail' = tail
    public boolean isEmpty() {
        return size == 0;
    }

    // Pre: element != null
    // Post: size' = size + 1 && head' = head && tail' = tail && tail.next = element
    public void enqueue(Object element) {
        assert element != null;

        Node node = new Node(element, null);
        if (size == 0) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    // Pre: size > 0
    // Post: R = head && size' = size - 1 && head' = head.next && tail' = tail
    public Object dequeue() {
        assert size > 0;

        Object element = head.value;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return element;
    }

    // Pre: size > 0
    // Post: R = head && size' = size && head' = head && tail' = tail
    public Object element() {
        assert size > 0;
        return head.value;
    }

    // Pre: true
    // Post: size' = 0 && head' = null && tail' = null
    public void clear() {
        head = null;
        tail = null;
        size = 0;

    }

    // Pre: true
    // Post: R = arr && size' = size && head' = head && tail' = tail
    public Object[] toArray() {
        Object[] arr = new Object[size];
        Node node = head;
        for (int i = 0; i < size; i++) {
            arr[i] = node.value;
            node = node.next;
        }
        return arr;
    }

}
