package com.matrix.matrix158springpracticeapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String bankAccount;
    private String location;
    private Integer status;

}
