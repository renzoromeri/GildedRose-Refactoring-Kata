package com.rr.ProyectoGildedRose;

import com.rr.ProyectoGildedRose.builder.ItemBuilder;
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
                new ItemBuilder().withName("Aged Brie").withSellIn(10).withQuality(20).build(),
                new ItemBuilder().withName("Backstage passes").withSellIn(15).withQuality(30).build(),
                new ItemBuilder().withName("Sulfuras").withSellIn(5).withQuality(80).build(),
                new ItemBuilder().withName("Conjured").withSellIn(3).withQuality(6).build(),
                new ItemBuilder().withName("Default").withSellIn(9).withQuality(7).build()
        );

        items.forEach(itemService::addItem);

    }
}
