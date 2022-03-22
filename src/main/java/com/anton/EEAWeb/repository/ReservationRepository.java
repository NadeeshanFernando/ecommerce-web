package com.anton.EEAWeb.repository;

import com.anton.EEAWeb.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import com.anton.EEAWeb.model.Reservation;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    @Query("SELECT p FROM Reservation p WHERE p.firstname LIKE %?1%"
            + " OR p.email LIKE %?1%"
            + " OR p.date LIKE %?1%"
            + " OR p.phone LIKE %?1%"
            + " OR p.time LIKE %?1%"
            + " OR CONCAT(p.numguest, '') LIKE %?1%")
    public List<Reservation> search(String keyword);
}

