package com.rr.ProyectoGildedRose.service.strategy;

import com.rr.ProyectoGildedRose.model.Item;

public class SulfurasUpdateStrategy implements ItemUpdateStrategy {

    private static final int SULFURAS_QUALITY = 80;

    @Override
    public void updateItem(Item item) {
        item.quality = SULFURAS_QUALITY;
    }
}
