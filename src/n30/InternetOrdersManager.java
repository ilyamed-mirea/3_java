package n30;


import java.io.*;

public class InternetOrdersManager implements OrdersManager {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public InternetOrdersManager() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean add(Order order) {
        if (head == null) {
            head = new QueueNode(order);
            tail = head;
        } else {
            tail.next = new QueueNode(order);
            tail = tail.next;
        }
        size++;
        return true;
    }

    public Order remove() {
        if (head == null) {
            return null;
        }
        Order order = head.value;
        head = head.next;
        size--;
        return order;
    }

    public Order order() {
        if (head == null) {
            return null;
        }
        return head.value;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        QueueNode current = head;
        for (int i = 0; i < size; i++) {
            count += current.value.itemQuantity(itemName);
            current = current.next;
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem menuItem) {
        int count = 0;
        QueueNode current = head;
        for (int i = 0; i < size; i++) {
            count += current.value.itemQuantity(menuItem);
            current = current.next;
        }
        return count;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        QueueNode current = head;
        for (int i = 0; i < size; i++) {
            orders[i] = current.value;
            current = current.next;
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        QueueNode current = head;
        for (int i = 0; i < size; i++) {
            cost += current.value.costTotal();
            current = current.next;
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }

    @Override
    public boolean writeOrdersToFile(String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            QueueNode current = head;
            for (int i = 0; i < size; i++) {
                oos.writeObject(current.value);
                current = current.next;
            }
        } catch (FileNotFoundException e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean readOrdersFromFile(String fileName) throws IOException {
        //read orders from file and write to to orders array
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                Order order = (Order) ois.readObject();
                add(order);
            }
        } catch (FileNotFoundException e) {
            return false;
        } catch (EOFException e) {
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
