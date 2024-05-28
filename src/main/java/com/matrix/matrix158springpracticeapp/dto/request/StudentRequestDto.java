package com.matrix.matrix158springpracticeapp.dto.request;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class StudentRequestDto {

    private Integer userId;
    private String stNumber;
    private String file;
    private Integer status;
    @Size(max = 16, min = 16)
    private String bankAccount;
}
