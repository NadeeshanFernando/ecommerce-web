package com.anton.EEAWeb.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.anton.EEAWeb.model.Employee;
import com.anton.EEAWeb.service.EmployeeService;

@Component
public class UserValidator{

    /*public class UserValidator implements Validator{*/

	/*@Autowired
    private EmployeeService employeeService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Employee.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
    	Employee employee = (Employee) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        if (employee.getUsername().length() < 6 || employee.getUsername().length() > 32) {
            errors.rejectValue("username", "Size.addemployeeform.username");
        }
        if (employeeService.findByUsername(employee.getUsername()) != null) {
            errors.rejectValue("username", "Duplicate.addemployeeform.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (employee.getPassword().length() < 8 || employee.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.addemployeeform.password");
        }

    }*/

}
