package n30;

import java.io.Serializable;

public class TableOrder implements Order, Serializable {
    private int size;
    private MenuItem[] items;

    public TableOrder() {
        this.size = 0;
        this.items = new MenuItem[10];
    }

    @Override
    public boolean add(MenuItem item) {
        if (size < items.length) {
            items[size] = item;
            size++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = items[i].getName();
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
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int itemQuantity(MenuItem menuItem) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(menuItem)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem menuItem) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(menuItem)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                size--;
                count++;
                i--;
            }
        }
        return count;
    }

    @Override
    public int removeAll(MenuItem menuItem) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(menuItem)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                size--;
                count++;
                i--;
            }
        }
        return count;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] sorted = new MenuItem[size];
        for (int i = 0; i < size; i++) {
            sorted[i] = items[i];
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (sorted[i].getCost() < sorted[j].getCost()) {
                    MenuItem temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }

    @Override
    public int costTotal() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += items[i].getCost();
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
        String result = "";
        for (int i = 0; i < size; i++) {
            result += items[i].toString() + " ";

        }
        return result;
    }
}
