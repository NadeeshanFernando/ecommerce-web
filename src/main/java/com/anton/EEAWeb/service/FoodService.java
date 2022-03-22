package com.anton.EEAWeb.service;

import java.util.List;


import com.anton.EEAWeb.model.Food;


public interface FoodService {

    public void addFood(Food food);

    public List<Food> listFood(String keyword);

    public List<Food> listMenu(String keyword);

    public void updateFood(Food food);

    public void deleteFood(int id);

    Food getFoodById(int id);
}
