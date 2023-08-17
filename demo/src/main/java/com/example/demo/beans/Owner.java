package com.example.demo.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long owner_id;

    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String pin_code;

    // Other fields, getters, setters...
}
