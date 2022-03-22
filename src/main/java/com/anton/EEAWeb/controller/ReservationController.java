package com.anton.EEAWeb.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anton.EEAWeb.model.Reservation;
import com.anton.EEAWeb.service.ReservationService;


@Controller
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/listreservation")
    public String listReservation(Model theModel, @Param("keyword") String keyword) {
        List<Reservation> theReservation = reservationService.listReservation(keyword);
        theModel.addAttribute("reservations", theReservation);
        theModel.addAttribute("keyword", keyword);
        return "forms/manage-reservation-page";
    }

    @GetMapping("/addreservation")
    public String addReservationForm(Model theModel) {
        Reservation theReservation = new Reservation();
        theModel.addAttribute("reservation", theReservation);
        return "forms/reservation-page";
    }

    @PostMapping("/addreservationform")
    public String addReservation(@ModelAttribute("reservation") Reservation thereservation) {
        reservationService.addReservation(thereservation);
        return "homepage/home-page";
    }

    @GetMapping("/rejectreservation")
    public String rejectReservation(@RequestParam("id") int theId) {
        reservationService.rejectReservation(theId);
        return "redirect:/listreservation";
    }

    @GetMapping("/showNewReservationForm")
    public String showNewReservationForm(Model model) {
        // create model attribute to bind form data
        Reservation reservation = new Reservation();
        model.addAttribute("reservation", reservation);
        return "index";
    }
	
	/*@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		// get employee from the service
		Reservation reservation = reservationService.getReservationById(id);
		
		// set employee as a model attribute to pre-populate the form
		model.addAttribute("reservation", reservation);
		return "update_reservation";
	}
	
	@GetMapping("/deleteReservation/{id}")
	public String deleteReservation(@PathVariable (value = "id") long id) {
		
		// call delete employee method 
		this.reservationService.deleteReservationById(id);
		return "redirect:/";
	}
	
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 5;
		
		Page<Reservation> page = reservationService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Reservation> listReservations = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listReservations", listReservations);
		return "index";
	}*/
}

