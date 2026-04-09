package com.baitap.bai2.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class FoodController {



    @GetMapping("/bai2")
    public String dish(){

        return "dish-list";
    }



}

