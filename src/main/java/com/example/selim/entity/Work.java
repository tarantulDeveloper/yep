package com.example.selim.entity;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Work {
    @Id
    @GeneratedValue(generator = "project_id_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "project_id_generator", sequenceName = "project_seq", allocationSize = 1)
    private int id;
    private String photoUrl;
    @OneToMany(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private List<WorkCategory> categories = new ArrayList<>();
}
