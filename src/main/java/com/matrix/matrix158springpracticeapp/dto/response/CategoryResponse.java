package com.matrix.matrix158springpracticeapp.dto.response;

import com.matrix.matrix158springpracticeapp.enums.Currency;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class CategoryResponse {
    private String name;
    private String syllabusPath;
    private Integer status;
}
