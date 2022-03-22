package com.anton.EEAWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anton.EEAWeb.model.Inquiry;

@Repository
public interface InquiryRepository extends JpaRepository<Inquiry, Integer> {

}
