package com.matrix.matrix158springpracticeapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class SocialMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String url;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    private Integer status;
}
