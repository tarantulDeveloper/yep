package com.example.selim.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Data
public class Status {
    @Id
    @GeneratedValue(generator = "status_id_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "status_id_generator", sequenceName = "status_seq", allocationSize = 1)
    private int id;
    private String statusName;

}
