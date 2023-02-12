package com.example.selim.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Feedback {
    @Id
    @GeneratedValue(generator = "feedback_id_generator",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "feedback_id_generator", sequenceName = "feedback_sequence", allocationSize = 1)
    private int id;
    private String firstName;
    private String lastName;
    private String gates;
    @Column(columnDefinition = "TEXT")
    private String feedback;
}
