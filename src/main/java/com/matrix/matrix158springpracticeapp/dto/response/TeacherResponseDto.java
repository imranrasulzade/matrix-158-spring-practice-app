package com.matrix.matrix158springpracticeapp.dto.response;

import lombok.Data;

@Data
public class TeacherResponseDto {
    private Integer id;
    private String name;
    private String surname;
    private String speciality;
    private String educationInfo;
    private String experienceInfo;
    private Integer status;
}
