package n30;

import static org.junit.jupiter.api.Assertions.*;

class DishTest {
    @org.junit.jupiter.api.Test
    void getName() {
        Dish dish = new Dish("name", 3, "desc");
        assertEquals("name", dish.getName());
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        Dish dish = new Dish("name", 3, "desc");
        assertEquals(3, dish.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getDescription() {
        Dish dish = new Dish("name", 3, "desc");
        assertEquals("desc", dish.getDescription());
    }
}