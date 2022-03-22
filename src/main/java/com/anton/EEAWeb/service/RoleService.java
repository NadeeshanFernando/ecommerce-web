package com.anton.EEAWeb.service;

import java.util.List;
import java.util.Optional;

import com.anton.EEAWeb.model.Role;


public interface RoleService {

	List<Role> findAll();

    Optional<Role> findOne(Integer id);
}
