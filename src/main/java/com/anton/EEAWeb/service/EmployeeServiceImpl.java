package com.anton.EEAWeb.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anton.EEAWeb.model.Employee;
import com.anton.EEAWeb.repository.EmployeeRepository;
import com.anton.EEAWeb.repository.RoleRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Autowired
	private RoleRepository roleRepository;
    
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    @Transactional
    public List<Employee> listEmployee(String keyword) {
        if (keyword != null) {
            return employeeRepository.search(keyword);
        }
        return employeeRepository.findAll();
    }

    @Override
    public void addEmployee(Employee employee) {
    	employee.setPassword(bCryptPasswordEncoder.encode(employee.getPassword()));
    	employee.setRoles(new HashSet<>(roleRepository.findAll()));
        employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        this.employeeRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        // TODO Auto-generated method stub
    	employee.setPassword(bCryptPasswordEncoder.encode(employee.getPassword()));
    	employee.setRoles(new HashSet<>(roleRepository.findAll()));
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        // TODO Auto-generated method stub
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }

}
