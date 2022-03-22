package com.anton.EEAWeb.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anton.EEAWeb.model.Reservation;
import com.anton.EEAWeb.repository.ReservationRepository;


@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    @Transactional
    public List<Reservation> listReservation(String keyword) {
        if (keyword != null) {
            return reservationRepository.search(keyword);
        }
        return reservationRepository.findAll();
    }

    @Override
    @Transactional
    public void addReservation(Reservation reservation) {
        this.reservationRepository.save(reservation);
    }

    @Override
    @Transactional
    public void rejectReservation(int id) {
        this.reservationRepository.deleteById(id);
    }
	
	/*@Override
	public Reservation getReservationById(long id) {
		Optional<Reservation> optional = reservationRepository.findById(id);
		Reservation reservation = null;
		if (optional.isPresent()) {
			reservation = optional.get();
		} else {
			throw new RuntimeException(" Reservation not found for id :: " + id);
		}
		return reservation;
	}

	@Override
	public void deleteReservationById(long id) {
		this.reservationRepository.deleteById(id);
	}

	@Override
	public Page<Reservation> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.reservationRepository.findAll(pageable);
	}*/

}

