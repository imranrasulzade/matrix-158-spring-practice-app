package com.matrix.matrix158springpracticeapp.dto.request;

import lombok.Data;

@Data
public class GroupRequestDto {
    private String name;
    private Integer capacity;
    private Integer studentCount;
}
