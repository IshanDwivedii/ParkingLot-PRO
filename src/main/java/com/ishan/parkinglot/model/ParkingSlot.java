package com.ishan.parkinglot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ParkingSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parkingSlotId;
}
