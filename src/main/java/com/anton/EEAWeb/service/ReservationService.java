package com.anton.EEAWeb.service;

import java.util.List;

import com.anton.EEAWeb.model.Reservation;

public interface ReservationService {

    public void addReservation(Reservation reservation);

    public List<Reservation> listReservation(String keyword);

    void rejectReservation(int id);
	/*Reservation getReservationById(long id);
	void deleteReservationById(long id);
	Page<Reservation> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);*/
}