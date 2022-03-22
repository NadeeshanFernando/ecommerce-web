package com.anton.EEAWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anton.EEAWeb.model.Role;
import com.anton.EEAWeb.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
    private RoleRepository roleRepository;
	
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Optional<Role> findOne(Integer id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id);
	}

}
