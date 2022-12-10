package n30;

class QueueNode {
    QueueNode next;
    QueueNode prev;
    Order value;

    QueueNode(Order value, QueueNode next, QueueNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    QueueNode(Order value) {
        this(value, null, null);
    }

    Order getValue() {
        return value;
    }

    QueueNode getNext() {
        return next;
    }

    QueueNode getPrev() {
        return prev;
    }

    void setValue(Order value) {
        this.value = value;
    }

    void setNext(QueueNode next) {
        this.next = next;
    }

    void setPrev(QueueNode prev) {
        this.prev = prev;
    }
}
