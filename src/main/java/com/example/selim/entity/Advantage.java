package com.example.selim.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Advantage {
    @Id
    @GeneratedValue(generator = "advantage_id_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "advantage_id_generator", sequenceName = "advantage_seq", allocationSize = 1)
    private int id;
    private String header;
    @Column(columnDefinition = "TEXT")
    private String text;
}
