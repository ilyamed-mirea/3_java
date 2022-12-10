package n30;

import java.io.IOException;
import java.util.Arrays;

public class Tester {
    //test program
    public static void main(String[] args) throws IOException {
        //test for QueueNode
        Order order1 = new InternetOrder();
        Order order2 = new TableOrder();
        QueueNode queueNode1 = new QueueNode(order1);
        QueueNode queueNode2 = new QueueNode(order2);

        //test for Customer
        Address address1 = new Address("street1", 353, "state1", 34, 'b', 12);
        Address address2 = new Address("street2", 564, "state2", 6, 'a', 12);
        Customer customer1 = new Customer("first1", "second1", 1, address1);
        Customer customer2 = new Customer("first2", "second2", 2, address2);
        System.out.println(customer1.getFirstName());
        System.out.println(customer1.getSecondName());
        System.out.println(customer1.getAge());
        System.out.println();

        //test for Order
        order1.add(new Drink("drink1", 1, "desc", 3.3, DrinkTypeEnum.GREEN_TEA));
        order1.add(new Drink("drink2", 2, "desc", 3.3, DrinkTypeEnum.MILK));

        order2.add(new Drink("drink3", 3, "desc", 3.3, DrinkTypeEnum.JAGERMEISTER));
        order2.add(new Drink("drink4", 4, "desc", 3.3, DrinkTypeEnum.CHAMPAGNE));

        System.out.println(Arrays.toString(order1.getItems()));
        System.out.println(Arrays.toString(order2.getItems()));

        TableOrdersManager tableOrdersManager = new TableOrdersManager();
        tableOrdersManager.add(order1,2);
        tableOrdersManager.add(order2, 3);
        System.out.println(Arrays.toString(tableOrdersManager.getOrders()));
        //write internet order to file
        tableOrdersManager.writeOrdersToFile("src/n30/internetOrders.txt");
        //read internet order from file
        tableOrdersManager.readOrdersFromFile("src/n30/internetOrders.txt");
        System.out.println(Arrays.toString(tableOrdersManager.getOrders()));

        System.out.println();

        //test for InternetOrder
        InternetOrdersManager internetOrdersManager = new InternetOrdersManager();
        internetOrdersManager.add(order1);
        internetOrdersManager.add(order2);
        System.out.println(Arrays.toString(internetOrdersManager.getOrders()));
        //write internet order to file
        internetOrdersManager.writeOrdersToFile("src/n30/internetOrder.txt");
        //read internet order from file
        internetOrdersManager.readOrdersFromFile("src/n30/internetOrder.txt");
        System.out.println(Arrays.toString(internetOrdersManager.getOrders()));
    }
}
