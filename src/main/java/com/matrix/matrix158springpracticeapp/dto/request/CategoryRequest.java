package com.matrix.matrix158springpracticeapp.dto.request;

import com.matrix.matrix158springpracticeapp.entity.Group;
import com.matrix.matrix158springpracticeapp.enums.Currency;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class CategoryRequest {

    private String name;
    private String syllabusPath;
    private Integer status;
    private Integer amount;
    @Enumerated(EnumType.STRING)
    private Currency currency;

}
