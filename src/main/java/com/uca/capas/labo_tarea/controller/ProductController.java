package com.uca.capas.labo_tarea.controller;

import com.uca.capas.labo_tarea.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    private List<Product> productos= new ArrayList<Product>();

    @GetMapping
    public ModelAndView prod(){
        ModelAndView mav= new ModelAndView();

        productos.add(new Product(1,"Doom",60));

        mav.setViewName("productos");
        mav.addObject("product",new Product());
        mav.addObject("producto",productos);
        return mav;

    }



}
