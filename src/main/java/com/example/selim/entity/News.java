package com.example.selim.entity;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Data
public class News {
    @Id
    @GeneratedValue(generator = "news_id_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "news_id_generator", sequenceName = "news_seq", allocationSize = 1)
    private int id;
    @Column(length = 2000)
    private String backgroundUrl;

    private String header;
    @Column(columnDefinition = "TEXT")
    private String text;

    @Column(length = 2000)
    private String contentImageUrl;

}
