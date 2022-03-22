package com.anton.EEAWeb.repository;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anton.EEAWeb.model.Food;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {

    @Query("SELECT p FROM Food p WHERE p.name LIKE %?1%"
            + " OR p.description LIKE %?1%"
            + " OR p.status LIKE %?1%"
            + " OR p.type LIKE %?1%"
            + " OR CONCAT(p.price, '') LIKE %?1%")
    public List<Food> search(String keyword);
}
