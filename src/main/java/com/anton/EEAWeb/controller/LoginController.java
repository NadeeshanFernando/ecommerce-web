package com.anton.EEAWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class LoginController {

    @RequestMapping("/adminHomePage")
    public ModelAndView adminHome() {
        return new ModelAndView("homepage/admin-home-page");
    }

    @RequestMapping("/managerHomePage")
    public ModelAndView managerHome() {
        return new ModelAndView("homepage/manager-home-page");
    }


}
