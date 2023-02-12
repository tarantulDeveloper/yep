package com.example.selim.entity;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Gate {
    @Id
    @GeneratedValue(generator = "gate_id_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "gate_id_generator", sequenceName = "gate_seq", allocationSize = 1)
    private int id;
    @Column(length = 2000)
    private String backgroundUrl;

    private String gateName;
    @Column(columnDefinition = "TEXT")
    private String descriptionText;

    @OneToMany(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "gate_id", referencedColumnName = "id")
    private List<GateType> gateTypes = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "gate_id", referencedColumnName = "id")
    private List<Advantage> advantages = new ArrayList<>();
}
