package com.rr.ProyectoGildedRose.builder;

import com.rr.ProyectoGildedRose.model.Item;

public class ItemBuilder {

    private Item item;

    public ItemBuilder() {
        this.item = new Item(null, 0, 0);
    }

    public ItemBuilder withName(String name) {
        item.name = name;
        return this;
    }

    public ItemBuilder withSellIn(int sellIn) {
        item.sellIn = sellIn;
        return this;
    }

    public ItemBuilder withQuality(int quality) {
        item.quality = quality;
        return this;
    }

    public Item build() {
        return item;
    }
}
