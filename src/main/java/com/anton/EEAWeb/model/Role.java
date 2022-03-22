package com.anton.EEAWeb.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "ROLE")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String name;

	@ManyToMany(mappedBy = "roles")
    private Set<Employee> employees;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Role(int id, String name, Set<Employee> employees) {
		this.id = id;
		this.name = name;
		this.employees = employees;
	}

	public Role(String name, Set<Employee> employees) {
		this.name = name;
		this.employees = employees;
	}

	public Role() {
	}

	@Override
	public String toString() {
		return "Role{" +
				"id=" + id +
				", name='" + name + '\'' +
				", employees=" + employees +
				'}';
	}


}
