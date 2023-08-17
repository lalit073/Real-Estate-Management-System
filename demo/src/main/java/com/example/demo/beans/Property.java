package com.example.demo.beans;

import java.time.LocalDate;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long property_id;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
    
    private String bhk_type;
    private int floor;
    private String facing;
    private int property_age;
    private double buildup_area;
    private String furnishing_type;
    private String parking;
    private String description;
    private LocalDate available_from;

    // Other fields, getters, setters...
}
