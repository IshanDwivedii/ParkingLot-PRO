package com.ishan.parkinglot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle{
    @Id
    public String vehicleNumber;
}
