package com.matrix.matrix158springpracticeapp.entity;

import com.matrix.matrix158springpracticeapp.enums.Currency;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
//sahe
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String syllabusPath;
    private Integer status;
    private Integer amount;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Group> groupList;

}
