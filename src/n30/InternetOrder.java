package n30;

import java.io.Serializable;

public class InternetOrder implements Order, Serializable {
    private int size;
    private ListNode head;
    private ListNode tail;

    public InternetOrder() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public boolean add(MenuItem item) {
        if (head == null) {
            head = new ListNode(item);
            tail = head;
        } else {
            tail.next = new ListNode(item);
            tail = tail.next;
        }
        size++;
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[size];
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            names[i] = current.value.getName();
            current = current.next;
        }
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            if (current.value.getName().equals(itemName)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    @Override
    public int itemQuantity(MenuItem menuItem) {
        int count = 0;
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(menuItem)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[size];
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            items[i] = current.value;
            current = current.next;
        }
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode current = head;
        ListNode previous = null;
        for (int i = 0; i < size; i++) {
            if (current.value.getName().equals(itemName)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem menuItem) {
        ListNode current = head;
        ListNode previous = null;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(menuItem)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        ListNode current = head;
        ListNode previous = null;
        for (int i = 0; i < size; i++) {
            if (current.value.getName().equals(itemName)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                count++;
                size--;
            }
            previous = current;
            current = current.next;
        }
        return count;
    }

    @Override
    public int removeAll(MenuItem menuItem) {
        int count = 0;
        ListNode current = head;
        ListNode previous = null;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(menuItem)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                count++;
                size--;
            }
            previous = current;
            current = current.next;
        }
        return count;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items = getItems();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (items[j].getCost() < items[j + 1].getCost()) {
                    MenuItem temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        return items;
    }

    @Override
    public int costTotal() {
        int total = 0;
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            total += current.value.getCost();
            current = current.next;
        }
        return total;
    }

    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public void setCustomer(Customer customer) {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            sb.append(current.value.toString());
            current = current.next;
        }
        return sb.toString();
    }
}
