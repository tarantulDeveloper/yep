package com.example.selim.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MainInfo {
    @Id
    @GeneratedValue(generator = "main_inf_id_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "main_inf_id_generator", sequenceName = "main_inf_seq", allocationSize = 1)
    private int id;
    private String header;
    private String secondaryHeader;
    @Column(length = 2000)
    private String backgroundUrl;
}
