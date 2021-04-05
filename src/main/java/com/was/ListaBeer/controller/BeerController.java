package com.was.ListaBeer.controller;

import com.was.ListaBeer.entity.Beer;
import com.was.ListaBeer.entity.Beers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/beers")
public class BeerController {

    @Autowired
    private Beers beers;

    @GetMapping
    public ModelAndView listar(){
        List<Beer> lista = beers.findAll();

        ModelAndView modelAndView = new ModelAndView("beers");
        modelAndView.addObject("beers", lista);

        return modelAndView;
    }
}
