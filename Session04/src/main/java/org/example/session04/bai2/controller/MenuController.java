package org.example.session04.bai2.controller;

import org.example.session04.bai1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MenuController {

    private final OrderService orderService;

    @Autowired
    public MenuController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/bai2/menu")
    @ResponseBody
    public String getMenu(
            @RequestParam(value = "category", required = false, defaultValue = "chay") String category
    ) {
        return "Menu loai: " + category;
    }
}
