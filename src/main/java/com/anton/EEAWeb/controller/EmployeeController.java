package com.anton.EEAWeb.controller;

import java.util.List;


import com.anton.EEAWeb.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.anton.EEAWeb.model.Employee;
import com.anton.EEAWeb.service.EmployeeService;
import com.anton.EEAWeb.service.RoleService;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    
    @Autowired
    private RoleService roleService;

    @Autowired
    private UserValidator userValidator;

    @GetMapping("/listemployee")
    public String listEmployee(Model theModel, @Param("keyword") String keyword) {
        List<Employee> theEmployee = employeeService.listEmployee(keyword);
        theModel.addAttribute("employees", theEmployee);
        theModel.addAttribute("keyword", keyword);
        return "forms/edit-employee-page";
    }

    @PostMapping(value = "/addemployeeform")
    public String addEmployee(@ModelAttribute("employee") Employee theemployee) {
        /*userValidator.validate(theemployee, bindingResult);

        if (bindingResult.hasErrors()) {
            return "redirect:/addemployee";
        }*/

        employeeService.addEmployee(theemployee);

        /*securityService.autoLogin(theemployee.getUsername(), theemployee.getPassword());*/

        return "redirect:/listemployee";
    }

    @GetMapping("/updateemployee")
    public String updateEmployee(@RequestParam int id, ModelMap model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.put("employee", employee);
        return "forms/update-employee-page";
    }

    @GetMapping("/deleteemployee")
    public String deleteEmployee(@RequestParam("id") int theId) {
        employeeService.deleteEmployee(theId);
        return "redirect:/listemployee";
    }

   /* @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }*/

}
