package com.rr.ProyectoGildedRose.service.strategy;

import com.rr.ProyectoGildedRose.model.Item;

public class ConjuredUpdateStrategy implements ItemUpdateStrategy {

    @Override
    public void updateItem(Item item) {
        item.sellIn--;

        int degradation = (item.sellIn < 0) ? 4 : 2;
        item.quality = Math.max(0, item.quality - degradation);
    }
}
