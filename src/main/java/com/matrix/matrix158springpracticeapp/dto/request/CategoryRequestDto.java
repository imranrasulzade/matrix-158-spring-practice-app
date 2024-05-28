package com.matrix.matrix158springpracticeapp.dto.request;

import com.matrix.matrix158springpracticeapp.enums.Currency;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class CategoryRequestDto {

    private String name;
    private String syllabusPath;
    private Integer status;
    private Integer amount;
    @Enumerated(EnumType.STRING)
    private Currency currency;

}
