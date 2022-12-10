package n29;

public class InternetOrder implements Order {
    private int size;
    private Item[] items;

    public InternetOrder() {
        this.size = 0;
        this.items = new Item[10];
    }

    public boolean add(Item item) {
        if (size < items.length) {
            items[size] = item;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(String name) {
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(name)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
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
            if (items[i].getName().equals(name)) {
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

    public int itemsQuantity() {
        return size;
    }

    public int itemsQuantity(String name) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public Item[] getItems() {
        return items;
    }

    @Override
    public int numOfItems(String name) {
        return 0;
    }

    public int costTotal() {
        int cost = 0;
        for (int i = 0; i < size; i++) {
            cost += items[i].getPrice();
        }
        return cost;
    }

    @Override
    public boolean add(String address, Order order) {
        return false;
    }

    public String[] itemsNames() {
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = items[i].getName();
        }
        return names;
    }

    @Override
    public int itemsPrice() {
        return 0;
    }

    @Override
    public int itemsInOrder() {
        return 0;
    }

    public Item[] sortedItemsByCostDesc() {
        Item[] sortedItems = new Item[size];
        for (int i = 0; i < size; i++) {
            sortedItems[i] = items[i];
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (sortedItems[i].getPrice() < sortedItems[j].getPrice()) {
                    Item temp = sortedItems[i];
                    sortedItems[i] = sortedItems[j];
                    sortedItems[j] = temp;
                }
            }
        }
        return sortedItems;
    }
}
