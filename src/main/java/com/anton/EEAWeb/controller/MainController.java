package com.anton.EEAWeb.controller;

import com.anton.EEAWeb.model.Employee;
import com.anton.EEAWeb.model.Food;
import com.anton.EEAWeb.model.Inquiry;
import com.anton.EEAWeb.model.Reservation;
import com.anton.EEAWeb.repository.EmployeeRepository;
import com.anton.EEAWeb.repository.FoodRepository;
import com.anton.EEAWeb.repository.InquiryRepository;
import com.anton.EEAWeb.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    FoodRepository foodRepository;

    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    InquiryRepository inquiryRepository;

    @Autowired
    EmployeeRepository employeeRepository;


    ////////////////////////////////////
    // ******** Employee Management ********
    ///////////////////////////////////

    @GetMapping("/listallemployee")
    List<Employee> allEmployee() {
        return employeeRepository.findAll();
    }

    @DeleteMapping("/deleteemployeebyid/{id}")
    void deleteEmployee(@PathVariable Integer id) {
        employeeRepository.deleteById(id);
    }


    ////////////////////////////////////
    // ******** Food Management ********
    ///////////////////////////////////

    @PostMapping("/addnewfood")
    Food addFood(@RequestBody Food food) {
        return foodRepository.save(food);
    }

    @GetMapping("/listallfood")
    List<Food> allFood() {
        return foodRepository.findAll();
    }

//    @GetMapping("/employees/{id}")
//    Employee getFoodById(@PathVariable Integer id) {
//
//        return foodRepository.findById(id)
//                .orElseThrow(() -> new FoodNotFoundException(id));
//    }

    @PutMapping("/editfoodbyid/{id}")
    Food editFood(@RequestBody Food food, @PathVariable Integer id) {

        return foodRepository.findById(id)
                .map(employee -> {
                    food.setName(food.getName());
                    food.setDescription(food.getDescription());
                    food.setPrice(food.getPrice());
                    food.setStatus(food.getStatus());
                    food.setType(food.getType());
                    return foodRepository.save(food);
                })
                .orElseGet(() -> {
                    food.setId(id);
                    return foodRepository.save(food);
                });
    }

    @DeleteMapping("/deletefoodbyid/{id}")
    void deleteFood(@PathVariable Integer id) {
        foodRepository.deleteById(id);
    }


    ///////////////////////////////////////////
    // ******** Reservation Management ********
    ///////////////////////////////////////////

    @PostMapping("/addnewreservation")
    Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @GetMapping("/listallreservation")
    List<Reservation> allReservation() {
        return reservationRepository.findAll();
    }

//    @GetMapping("/employees/{id}")
//    Employee getFoodById(@PathVariable Integer id) {
//
//        return foodRepository.findById(id)
//                .orElseThrow(() -> new FoodNotFoundException(id));
//    }

    @DeleteMapping("/deletereservationbyid/{id}")
    void deleteReservation(@PathVariable Integer id) {
        reservationRepository.deleteById(id);
    }


     //////////////////////////////////////
    // ******** Inquiry Management ********
    //////////////////////////////////////

    @PostMapping("/addnewinquiry")
    Inquiry addInquiry(@RequestBody Inquiry inquiry) {
        return inquiryRepository.save(inquiry);
    }

    @GetMapping("/listallinquiry")
    List<Inquiry> allInquiryn() {
        return inquiryRepository.findAll();
    }

//    @GetMapping("/employees/{id}")
//    Employee getFoodById(@PathVariable Integer id) {
//
//        return foodRepository.findById(id)
//                .orElseThrow(() -> new FoodNotFoundException(id));
//    }

    @DeleteMapping("/deleteinquirybyid/{id}")
    void deleteInquiry(@PathVariable Integer id) {
        inquiryRepository.deleteById(id);
    }



    @GetMapping(value = "/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login-page";
    }




}
