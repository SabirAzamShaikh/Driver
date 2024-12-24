package com.example.SecurityImplementation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Driver
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
private String name;
private int salary;
private String address;
}
