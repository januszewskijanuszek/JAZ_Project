package com.example.demo.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    WebClient webClient = WebClient.create("http://localhost:8080");

    @RequestMapping(value = "/avBooks")
    public String avBooks(Model model){
        model.addAttribute("avBooks", itemService.getAvaliableItems(false));
        return "avBooks";
    }

    @RequestMapping(value = "/unBooks")
    public String unBooks(Model model){
        model.addAttribute("unBooks", itemService.getAvaliableItems(true));
        return "unBooks";
    }
}
