package com.anton.EEAWeb.repository;

import com.anton.EEAWeb.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anton.EEAWeb.model.Employee;

import java.util.List;
import java.util.Optional;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT p FROM Employee p WHERE p.username LIKE %?1%"
			+ " OR p.lastname LIKE %?1%"
			+ " OR p.phone LIKE %?1%"
			+ " OR p.email LIKE %?1%")
	public List<Employee> search(String keyword);

	@Query("SELECT u FROM Employee u WHERE u.username = :username")
	public Employee getEmployeeByUsername(@Param("username") String username);
}
