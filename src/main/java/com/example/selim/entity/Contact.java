package com.example.selim.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Contact {
    @Id
    @GeneratedValue(generator = "contact_id_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "contact_id_generator", sequenceName = "contact_seq", allocationSize = 1)
    private int id;
    private String contact;
}
