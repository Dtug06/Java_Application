package org.example.session5.controller;

import org.example.session5.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping
public class HomeController {

List<Product> products =new ArrayList<>(
        Arrays.asList(
                new Product(1,"Bánh mỳ",5000,true,1),
                new Product(2,"Car",4000,false,2)
        )
);


    @GetMapping
    public String home(Model model){
       model.addAttribute("shop",products);

        return "home";
    }

    @GetMapping("/delete/{id}")
    public String handlDelete(@PathVariable(name = "id") int id){
      products=  products.stream().filter(p->p.getId() !=id).toList();
      return "redirect:/";
    }

}
