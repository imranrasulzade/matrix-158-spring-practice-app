package com.matrix.matrix158springpracticeapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "mj_teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JoinColumn(name = "user_id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;
    private String speciality;
    private String educationInfo;
    private String experienceInfo;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<SocialMedia> socialMedia;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Group> groupList;

    private Integer status;



}
