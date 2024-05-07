package com.matrix.matrix158springpracticeapp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "mj_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JoinColumn(name = "user_id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;
    private String stNumber;
    private String file;
    private Integer status;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Reservation> reservationList;

    @NotNull
    @Size(max = 16, min = 16)
    private String bankAccount;
}
