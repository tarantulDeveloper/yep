package com.example.selim.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AboutUs {
    @Id
    @GeneratedValue(generator = "about_us_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "about_us_generator", sequenceName = "about_us_seq", allocationSize = 1)
    private int id;
    private String header;
    @Column(columnDefinition = "TEXT")
    private String text;
    @Column(length = 2000)
    private String backgroundUrl;
}
