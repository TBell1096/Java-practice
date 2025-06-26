package org.example;

import org.example.data.Item;
import org.example.service.CartService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    public void addItemToList() {
        CartService service = new CartService();
        Item t = new Item("Book", 3, 5.84);
        service.addItem(t);

        assertEquals(1, service.getItemsList().size());
        assertEquals(t, service.getItemsList().get(0));
    }

    @Test
    public void removeItem() {
        CartService service = new CartService();
        Item t = new Item("Book", 3, 5.84);
        service.addItem(t);
        service.removeItem(0, 3);

        assertTrue(service.getItemsList().isEmpty());
    }





    @Test
    public void checkOut() {
        CartService service = new CartService();
        Item t = new Item("Book", 3, 5.00);
        Item g = new Item("Shelf", 2, 20.00);
        service.addItem(g);
        service.addItem(t);
        service.checkOut();

        assertEquals(55.00, service.checkOut());
    }
}