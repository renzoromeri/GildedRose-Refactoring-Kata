package com.rr.ProyectoGildedRose;

import com.rr.ProyectoGildedRose.controller.ItemController;
import com.rr.ProyectoGildedRose.model.Item;
import com.rr.ProyectoGildedRose.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ItemService itemService;

    @Test
    public void testGetItems() throws Exception {
        List<Item> items = Arrays.asList(
                new Item("Aged Brie", 10, 20),
                new Item("Backstage passes", 15, 30)
        );
        when(itemService.getAllItems()).thenReturn(items);

        mockMvc.perform(get("/items"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Lista de ítems obtenida correctamente."))
                .andExpect(jsonPath("$.items.length()").value(2));
    }

    @Test
    public void testUpdateItems() throws Exception {
        mockMvc.perform(post("/items/update"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Se han actualizado los ítems correctamente."));
    }
}
