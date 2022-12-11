package n30;

import javax.swing.*;

public class Graphic extends JFrame {
    InternetOrder order;
    InternetOrdersManager manager;
    public Graphic() {
        super("Graphic");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(null);

        manager = new InternetOrdersManager();
        order = new InternetOrder();

        JButton add = new JButton("add drink to order");
        add.setBounds(10, 10, 100, 30);
        add.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Enter name of drink");
            int price = Integer.parseInt(JOptionPane.showInputDialog("Enter price of drink"));
            String description = JOptionPane.showInputDialog("Enter description of drink");
            double volume = Double.parseDouble(JOptionPane.showInputDialog("Enter volume of drink"));
            DrinkTypeEnum type = DrinkTypeEnum.valueOf(JOptionPane.showInputDialog("Enter type of drink"));
            Drink drink = new Drink(name, price, description, volume, type);
            order.add(drink);
        });
        add(add);
        JButton remove = new JButton("remove drink from order");
        remove.setBounds(10, 50, 100, 30);
        remove.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Enter name of drink");
            int price = Integer.parseInt(JOptionPane.showInputDialog("Enter price of drink"));
            String description = JOptionPane.showInputDialog("Enter description of drink");
            double volume = Double.parseDouble(JOptionPane.showInputDialog("Enter volume of drink"));
            DrinkTypeEnum type = DrinkTypeEnum.valueOf(JOptionPane.showInputDialog("Enter type of drink"));
            Drink drink = new Drink(name, price, description, volume, type);
            order.remove(drink);
        });
        add(remove);

        JButton addOrder = new JButton("send order to manager");
        addOrder.setBounds(10, 90, 100, 30);
        addOrder.addActionListener(e -> {
            manager.add(order);
        });

        JButton show = new JButton("show order items");
        show.setBounds(10, 130, 100, 30);
        show.addActionListener(e -> {
            JFrame frame = new JFrame("Order items");
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.setLocationRelativeTo(null);
            frame.setLayout(null);
            int y = 10;
            for (MenuItem item : order.getItems()) {
                JLabel label = new JLabel(item.getName());
                label.setBounds(10, y, 100, 30);
                frame.add(label);
                y += 40;
            }
            frame.setVisible(true);
        });
        add(show);

        JButton showPrice = new JButton("show cost of the order");
        showPrice.setBounds(10, 170, 100, 30);
        showPrice.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, order.costTotal());
        });
        add(showPrice);

        JButton removeOrders = new JButton("remove all orders");
        removeOrders.setBounds(10, 210, 100, 30);
        removeOrders.addActionListener(e -> {
            for (int i=0;i<manager.getOrders().length;i++) {
                    manager.remove();
            }
        });
        add(removeOrders);
    }

    public static void main(String[] args) {
        new Graphic().setVisible(true);
    }
}
