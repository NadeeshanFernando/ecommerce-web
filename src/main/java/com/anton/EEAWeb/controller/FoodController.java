package com.anton.EEAWeb.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anton.EEAWeb.model.Food;
import com.anton.EEAWeb.service.FoodService;

import javax.validation.Valid;


@Controller
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/listfood")
    public String listFood(Model theModel, @Param("keyword") String keyword) {
        List<Food> theFood = foodService.listFood(keyword);
        theModel.addAttribute("foods", theFood);
        theModel.addAttribute("keyword", keyword);
        return "forms/edit-food-page";
    }

    @GetMapping("/listmenu")
    public String listMenu(Model theModel, @Param("keyword") String keyword) {
        List<Food> theFood = foodService.listFood(keyword);
        theModel.addAttribute("foods", theFood);
        theModel.addAttribute("keyword", keyword);
        return "menu-page";
    }

    @PostMapping("/addfoodform")
    public String addFood(@Valid @ModelAttribute("food") Food thefood,
                          BindingResult bindingResult) {
        System.out.println(thefood);

        if (bindingResult.hasErrors()) {
            return "addfood";
        }
        foodService.addFood(thefood);
        return "redirect:/listfood";
    }

    @GetMapping("/updatefood")
    public String updateFood(@RequestParam int id, ModelMap model) {
        Food food = foodService.getFoodById(id);
        model.put("food", food);
        return "forms/update-food-page";
    }

    @GetMapping("/deletefood")
    public String deleteFood(@RequestParam("id") int theId) {
        foodService.deleteFood(theId);
        return "redirect:/listfood";
    }


}
