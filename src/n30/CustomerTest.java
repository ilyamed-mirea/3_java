package n30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getFirstName() {
        Customer customer = new Customer("first", "last", 25, new Address("String cityName", 225, "String streetName", 2, 'c', 12));
        assertEquals("first", customer.getFirstName());
    }

    @Test
    void getSecondName() {
Customer customer = new Customer("first", "last", 25, new Address("String cityName", 225, "String streetName", 2, 'c', 12));
        assertEquals("last", customer.getSecondName());
    }

    @Test
    void getAge() {
Customer customer = new Customer("first", "last", 25, new Address("String cityName", 225, "String streetName", 2, 'c', 12));
        assertEquals(25, customer.getAge());
    }

    @Test
    void getAddress() {
Customer customer = new Customer("first", "last", 25, new Address("String cityName", 225, "String streetName", 2, 'c', 12));
        assertEquals(new Address("String cityName", 225, "String streetName", 2, 'c', 12), customer.getAddress());
    }
}