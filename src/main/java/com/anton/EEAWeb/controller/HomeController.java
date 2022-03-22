package com.anton.EEAWeb.controller;

import com.anton.EEAWeb.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anton.EEAWeb.model.Employee;
import com.anton.EEAWeb.model.Food;
import com.anton.EEAWeb.model.Inquiry;
import com.anton.EEAWeb.model.Reservation;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private FoodService foodService;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        return "homepage/home-page";
    }

    @RequestMapping("/adminhome")
    public String viewAdminHomePage(Model model) {
        return "homepage/admin-home-page";
    }

    @RequestMapping("/managerhome")
    public String viewManagerHomePage(Model model) {
        return "homepage/manager-home-page";
    }

    @RequestMapping("/receptionhome")
    public String viewReceptionHomePage(Model model) {
        return "homepage/reception-home-page";
    }

    @RequestMapping("/about")
    public String viewAboutPage(Model model) {
        return "about-page";
    }

    @RequestMapping("/errorpage")
    public String viewErrorPage(Model model) {
        return "error-page";
    }

    @RequestMapping("/contact")
    public String viewContactPage(Model model) {
        return "contact-page";
    }

    @RequestMapping("/reservation")
    public String viewReservationPage(Model model) {
        Reservation reservation = new Reservation();
        model.addAttribute("reservation", reservation);
        return "forms/reservation-page";
    }

    @RequestMapping("/addfood")
    public String addFood(Model model) {
        Food food = new Food();
        model.addAttribute("food", food);
        return "forms/add-food-page";
    }

    @RequestMapping(value="/addemployee")
    public String addEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "forms/add-employee-page";
    }

    @RequestMapping("/addinquiry")
    public String addInquiry(Model model) {
        Inquiry inquiry = new Inquiry();
        model.addAttribute("inquiry", inquiry);
        return "forms/inquiry-page";
    }

    @RequestMapping("/nav2")
    public String viewNav2Page(Model model) {
        return "nav2";
    }

    @RequestMapping("/testpage")
    public String viewTestPage(Model model) {
        return "test";
    }

    @RequestMapping("/test2")
    public String viewTest2Page(Model model) {
        return "test2";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login-page";
    }
    
}
