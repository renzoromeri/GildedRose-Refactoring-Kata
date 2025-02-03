package com.rr.ProyectoGildedRose;

import com.rr.ProyectoGildedRose.model.Item;
import com.rr.ProyectoGildedRose.service.ItemService;
import java.util.List;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoGildedRoseApplication implements CommandLineRunner {

    private final ItemService itemService;

    public ProyectoGildedRoseApplication(ItemService itemService) {
        this.itemService = itemService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProyectoGildedRoseApplication.class, args);
    }

    @Override
    public void run(String... args) {
        List<Item> items = List.of(
                new Item("Aged Brie", 10, 20),
                new Item("Backstage passes", 15, 30),
                new Item("Sulfuras", 5, 80),
                new Item("Conjured", 3, 6),
                new Item("Default", 9, 7)
        );

        items.forEach(itemService::addItem);

    }
}
