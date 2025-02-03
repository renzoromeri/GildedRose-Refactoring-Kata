package com.rr.ProyectoGildedRose.service.strategy;

import com.rr.ProyectoGildedRose.model.Item;

public class DefaultItemUpdateStrategy implements ItemUpdateStrategy {

    @Override
    public void updateItem(Item item) {
        item.sellIn--;

        if (item.quality > 0) {
            int qualityChange = (item.sellIn < 0) ? 2 : 1;
            item.quality = Math.max(item.quality - qualityChange, 0);
        }
    }
}
