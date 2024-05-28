package com.matrix.matrix158springpracticeapp.dto.response;

import lombok.Data;

@Data
public class StudentResponseDto {
    private Integer id;
    private String name;
    private String surname;
    private String stNumber;
    private String file;
    private Integer status;
    private String bankAccount;
}
