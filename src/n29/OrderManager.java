package n29;

import java.util.HashMap;

public class OrderManager {
    private int size;
    private HashMap<String, Order> orders;

    public OrderManager() {
        this.size = 0;
        this.orders = new HashMap<>();
    }

    public boolean add(Order order) {
        if (size < orders.size()) {
            orders.put(order.toString(), order);
            size++;
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(String name) {
        for (int i = 0; i < size; i++) {
            if (orders.get(i).toString().equals(name)) {
                for (int j = i; j < size - 1; j++) {
                    orders.put(orders.get(j).toString(), orders.get(j + 1));
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public int removeAll(String name) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (orders.get(i).toString().equals(name)) {
                for (int j = i; j < size - 1; j++) {
                    orders.put(orders.get(j).toString(), orders.get(j + 1));
                }
                size--;
                count++;
                i--;
            }
        }
        return count;
    }

    public int itemsQuantity() {
        return size;
    }

    public int itemsQuantity(String name) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (orders.get(i).toString().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public int itemsQuantity(Item item) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (orders.get(i).toString().equals(item.getName())) {
                count++;
            }
        }
        return count;
    }

    public Order[] getOrders() {
        return new Order[0];
    }

    public int ordersCostSummary() {
        return 0;
    }

    public int ordersQuantity() {
        return 0;
    }

    public int ordersQuantity(Item item) {
        return 0;
    }

    public int ordersQuantity(String name) {
        return 0;
    }
}
