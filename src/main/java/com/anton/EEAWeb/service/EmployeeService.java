package com.anton.EEAWeb.service;

import java.util.List;


import com.anton.EEAWeb.model.Employee;


public interface EmployeeService {

    public void addEmployee(Employee employee);

    public List<Employee> listEmployee(String keyword);

    public void updateEmployee(Employee employee);

    public void deleteEmployee(int id);

    Employee getEmployeeById(int id);

}
