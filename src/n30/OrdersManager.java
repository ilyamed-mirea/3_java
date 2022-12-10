package n30;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem menuItem);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
    boolean writeOrdersToFile(String fileName) throws IOException;
    boolean readOrdersFromFile(String fileName) throws IOException;
}
