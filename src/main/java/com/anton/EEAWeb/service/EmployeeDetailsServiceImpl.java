package com.anton.EEAWeb.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anton.EEAWeb.model.Employee;
import com.anton.EEAWeb.model.Role;
import com.anton.EEAWeb.repository.EmployeeRepository;

@Service
public class EmployeeDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        Employee employee = employeeRepository.getEmployeeByUsername(username);

        if (employee == null) {
            throw new UsernameNotFoundException("Could not find Employee");
        }
        return new EmployeeDetails(employee);
    }

}
