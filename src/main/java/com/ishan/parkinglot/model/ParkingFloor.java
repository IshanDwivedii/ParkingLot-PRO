package com.ishan.parkinglot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ParkingFloor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int floorNumber;

    @OneToMany(mappedBy = "parkingFloor", cascade = CascadeType.ALL)
    private List<ParkingSlot> parkingSlots;

    @ManyToOne
    @JoinColumn(name = "parking_lot_id")
    private ParkingLot parkingLot;

}
