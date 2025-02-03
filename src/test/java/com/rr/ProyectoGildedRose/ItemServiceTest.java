package com.rr.ProyectoGildedRose;

import com.rr.ProyectoGildedRose.model.Item;
import com.rr.ProyectoGildedRose.service.ItemService;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ItemServiceTest {

    @Autowired
    private ItemService itemService;

    @BeforeEach
    public void setup() {
        itemService = new ItemService();
    }

    @Test
    public void testAddItem() {
        Item item = new Item("Aged Brie", 10, 20);
        itemService.addItem(item);

        List<Item> items = itemService.getAllItems();
        assertEquals(1, items.size());
        assertEquals("Aged Brie", items.get(0).name);
    }

    @Test
    public void testUpdateQuality() {
        Item item = new Item("Aged Brie", 10, 20);
        itemService.addItem(item);

        itemService.updateQuality();

        assertEquals(21, item.quality);

        Item anotherItem = new Item("Sulfuras", 5, 80);
        itemService.addItem(anotherItem);

        itemService.updateQuality();
        assertEquals(80, anotherItem.quality);
    }
}
