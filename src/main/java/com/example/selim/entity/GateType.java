package com.example.selim.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class GateType {
    @Id
    @GeneratedValue(generator = "gate_type_id_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "gate_type_id_generator", sequenceName = "gate_type_seq", allocationSize = 1)
    private int id;
    @Column(length = 2000)
    private String backgroundUrl;
    @Column(columnDefinition = "TEXT")
    private String descriptionText;
}
