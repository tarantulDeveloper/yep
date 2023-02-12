package com.example.selim.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class WorkCategory {
    @Id
    @GeneratedValue(generator = "project_category_id_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "project_category_id_generator", sequenceName = "proj_cat_seq", allocationSize = 1)
    private int id;
    private String projectCategoryName;
}
