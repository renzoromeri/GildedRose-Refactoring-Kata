package com.rr.ProyectoGildedRose.service.factory;

import com.rr.ProyectoGildedRose.service.strategy.*;
import java.util.*;

public class ItemUpdateStrategyFactory {

    private static final Map<String, ItemUpdateStrategy> strategies = new HashMap<>();

    static {
        strategies.put("Aged Brie", new AgedBrieUpdateStrategy());
        strategies.put("Backstage passes", new BackstagePassUpdateStrategy());
        strategies.put("Sulfuras", new SulfurasUpdateStrategy());
        strategies.put("Conjured", new ConjuredUpdateStrategy());
        strategies.put("default", new DefaultItemUpdateStrategy());
    }

    public static ItemUpdateStrategy getStrategy(String itemName) {
        return strategies.getOrDefault(itemName, strategies.get("default"));
    }
}
