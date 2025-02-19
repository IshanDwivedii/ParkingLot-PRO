package com.ishan.parkinglot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public abstract class Gate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long gateId;

    @ManyToOne(fetch = FetchType.LAZY)
    protected Operator operator;


}
