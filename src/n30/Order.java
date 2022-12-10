package n30;

import java.io.Serializable;

public interface Order extends Serializable {
    boolean add(MenuItem item); //добавления позиции в заказ (принимает ссылку типа Item), при этом возвращает логическое значение;

    String[] itemsNames(); //возвращает массив названий заказанных блюд и напитков (без повторов);

    int itemsQuantity(); //возвращает количество заказанных блюд и напитков;

    int itemQuantity(String itemName); //возвращает количество заказанных блюд и напитков по названию;

    int itemQuantity(MenuItem menuItem); //возвращает количество заказанных блюд и напитков по ссылке на MenuItem;

    MenuItem[] getItems(); //возвращает массив заказанных блюд и напитков;

    boolean remove(String itemName); //удаляет позицию из заказа по названию, при этом возвращает логическое значение;

    boolean remove(MenuItem menuItem); //удаляет позицию из заказа по ссылке на MenuItem, при этом возвращает логическое значение;

    int removeAll(String itemName); //удаляет все позиции из заказа по названию, при этом возвращает количество удаленных позиций;

    int removeAll(MenuItem menuItem); //удаляет все позиции из заказа по ссылке на MenuItem, при этом возвращает количество удаленных позиций;

    MenuItem[] sortedItemsByCostDesc(); //возвращает массив заказанных блюд и напитков, отсортированный по убыванию цены;

    int costTotal(); //возвращает стоимость заказа;

    Customer getCustomer(); //возвращает ссылку на объект Customer, которому принадлежит заказ;

    void setCustomer(Customer customer); //устанавливает ссылку на объект Customer, которому принадлежит заказ;

    // Дополнительные методы:
    @Override
    String toString();
}
