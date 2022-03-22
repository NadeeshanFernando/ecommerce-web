package com.anton.EEAWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anton.EEAWeb.model.Inquiry;
import com.anton.EEAWeb.service.InquiryService;

@Controller
public class InquiryController {

    @Autowired
    private InquiryService inquiryService;

    @GetMapping("/listinquiry")
    public String listInquiry(Model theModel) {
        List<Inquiry> theInquiry = inquiryService.listInquiry();
        theModel.addAttribute("inquiries", theInquiry);
        return "forms/manage-inquiry-page";
    }

    @PostMapping("/addinquiry")
    public String addInquiry(@ModelAttribute("inquiry") Inquiry theinquiry) {
        inquiryService.addInquiry(theinquiry);
        return "homepage/home-page";
    }

    @GetMapping("/deleteinquiry")
    public String deleteInquiry(@RequestParam("id") int theId) {
        inquiryService.deleteInquiry(theId);
        return "redirect:/listinquiry";
    }

}
