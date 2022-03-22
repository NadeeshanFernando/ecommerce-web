package com.anton.EEAWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INQUIRY")
public class Inquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstname;

    private String email;

    private String phone;

    private String description;

    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Inquiry(int id, String firstname, String email, String phone, String description, String type) {
        super();
        this.id = id;
        this.firstname = firstname;
        this.email = email;
        this.phone = phone;
        this.description = description;
        this.type = type;
    }

    public Inquiry(String firstname, String email, String phone, String description, String type) {
        super();
        this.firstname = firstname;
        this.email = email;
        this.phone = phone;
        this.description = description;
        this.type = type;
    }

    public Inquiry() {
        super();
        // TODO Auto-generated constructor stub
    }

}
