package com.matrix.matrix158springpracticeapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "authorities")
public class Authority {

    @Id
    private String name;
}
