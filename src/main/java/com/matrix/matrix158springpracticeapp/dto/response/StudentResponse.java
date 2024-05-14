package com.matrix.matrix158springpracticeapp.dto.response;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class StudentResponse {
    private String stNumber;
    private String file;
    private Integer status;
}
