package com.rr.ProyectoGildedRose.service;

import com.rr.ProyectoGildedRose.model.Item;
import com.rr.ProyectoGildedRose.service.factory.ItemUpdateStrategyFactory;
import com.rr.ProyectoGildedRose.service.strategy.ItemUpdateStrategy;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getAllItems() {
        return new ArrayList<>(items);
    }

    public void updateQuality() {
        items.stream()
                .filter(item -> ItemUpdateStrategyFactory.getStrategy(item.name) != null)
                .forEach(item -> updateItemQuality(item));
    }

    private void updateItemQuality(Item item) {
        ItemUpdateStrategy strategy = ItemUpdateStrategyFactory.getStrategy(item.name);
        strategy.updateItem(item);
    }
}
