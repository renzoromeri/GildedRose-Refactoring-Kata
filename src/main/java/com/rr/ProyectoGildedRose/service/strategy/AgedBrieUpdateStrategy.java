package com.rr.ProyectoGildedRose.service.strategy;

import com.rr.ProyectoGildedRose.model.Item;

public class AgedBrieUpdateStrategy implements ItemUpdateStrategy {

    @Override
    public void updateItem(Item item) {
        item.sellIn--;

        if (item.quality < 50) {
            item.quality += (item.sellIn < 0) ? 2 : 1;
            item.quality = Math.min(item.quality, 50);
        }
    }
}
