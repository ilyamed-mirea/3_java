package n30;

import java.io.*;
import java.util.Arrays;

public class TableOrdersManager implements OrdersManager, Serializable {
    private Order[] orders;

    public TableOrdersManager() {
        this.orders = new Order[10];
    }

    public void add(Order order, int tableNumber) {
        if (tableNumber < orders.length) {
            orders[tableNumber] = order;
        }
    }

    public void addItem(MenuItem item, int tableNumber) {
        if (tableNumber < orders.length) {
            orders[tableNumber].add(item);
        }
    }

    public int freeTableNumber() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public int[] freeTableNumbers() {
        int count = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                count++;
            }
        }
        int[] freeTables = new int[count];
        int j = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                freeTables[j] = i;
                j++;
            }
        }
        return freeTables;
    }

    public Order getOrder(int tableNumber) {
        if (tableNumber < orders.length) {
            return orders[tableNumber];
        } else {
            return null;
        }
    }

    public int remove(int tableNumber) {
        if (tableNumber < orders.length) {
            orders[tableNumber] = null;
            return tableNumber;
        } else {
            return -1;
        }
    }

    public int remove(Order order) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                return i;
            }
        }
        return -1;
    }

    public int removeAll(Order order) {
        int count = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                count++;
            }
        }
        return count;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                count += orders[i].itemQuantity(itemName);
            }
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem menuItem) {
        int count = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                count += orders[i].itemQuantity(menuItem);
            }
        }
        return count;
    }

    @Override
    public Order[] getOrders() {
        int count = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                count++;
            }
        }
        Order[] ordersArray = new Order[count];
        int j = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                ordersArray[j] = orders[i];
                j++;
            }
        }
        return ordersArray;
    }

    @Override
    public int ordersCostSummary() {
        int sum = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                sum += orders[i].costTotal();
            }
        }
        return sum;
    }

    @Override
    public int ordersQuantity() {
        int count = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean writeOrdersToFile(String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            for (int i = 0; i < orders.length; i++) {
                if (orders[i] != null) {
                    oos.writeObject(orders[i]);
                }
            }
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }


    @Override
    public boolean readOrdersFromFile(String fileName) throws IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            int i = 0;
            while (true) {
                orders[i] = (Order) ois.readObject();
                i++;
            }
        } catch (FileNotFoundException | EOFException | ClassNotFoundException e) {
            return false;
        }
    }
}
