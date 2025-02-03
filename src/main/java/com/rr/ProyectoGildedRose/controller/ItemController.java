package com.rr.ProyectoGildedRose.controller;

import com.rr.ProyectoGildedRose.model.Item;
import com.rr.ProyectoGildedRose.service.ItemService;
import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    private ResponseEntity<Map<String, Object>> createResponse(String message, List<Item> items) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        if (items != null && !items.isEmpty()) {
            response.put("items", items);
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<Map<String, Object>> getItems() {
        List<Item> items = itemService.getAllItems();
        String message = items.isEmpty() ? "No hay ítems para mostrar." : "Lista de ítems obtenida correctamente.";
        return createResponse(message, items);
    }

    @PostMapping("/update")
    public ResponseEntity<Map<String, Object>> updateItems() {
        itemService.updateQuality();
        List<Item> updatedItems = itemService.getAllItems();
        return createResponse("Se han actualizado los ítems correctamente.", updatedItems);
    }
}
