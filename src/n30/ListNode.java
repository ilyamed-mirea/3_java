package n30;

import java.io.Serializable;

class ListNode implements Serializable {
    MenuItem value;
    ListNode next;

    ListNode(MenuItem value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    ListNode(MenuItem value) {
        this(value, null);
    }

    MenuItem getValue() {
        return value;
    }

    ListNode getNext() {
        return next;
    }

    void setValue(MenuItem value) {
        this.value = value;
    }

    void setNext(ListNode next) {
        this.next = next;
    }
}
