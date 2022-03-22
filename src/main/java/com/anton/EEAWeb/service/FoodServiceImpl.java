package com.anton.EEAWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anton.EEAWeb.model.Food;
import com.anton.EEAWeb.repository.FoodRepository;


@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    @Transactional
    public List<Food> listFood(String keyword) {

        if (keyword != null) {
            return foodRepository.search(keyword);
        }
        return foodRepository.findAll();
    }

    @Override
    @Transactional
    public List<Food> listMenu(String keyword) {

        if (keyword != null) {
            return foodRepository.search(keyword);
        }
        return foodRepository.findAll();
    }

    @Override
    @Transactional
    public void addFood(Food food) {
        this.foodRepository.save(food);
    }

    @Override
    @Transactional
    public void updateFood(Food food) {
        this.foodRepository.save(food);
    }

    @Override
    @Transactional
    public void deleteFood(int id) {
        this.foodRepository.deleteById(id);
    }

    @Override
    public Food getFoodById(int id) {
        // TODO Auto-generated method stub
        Optional<Food> optional = foodRepository.findById(id);
        Food food = null;
        if (optional.isPresent()) {
            food = optional.get();
        } else {
            throw new RuntimeException(" Food not found for id :: " + id);
        }
        return food;
    }
}
