package n29;

public class RestaurantOrder implements Order {
    private int size;
    private Item[] items;

    public RestaurantOrder() {
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

    @Override
    public Item[] sortedItemsByCostDesc() {
        return new Item[0];
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

    public int itemQuantity(String name) {
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
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += items[i].getPrice();
        }
        return total;
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

    public String[] itemsNames (String name) {
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = items[i].getName();
        }
        return names;
    }


}
