package com.matrix.matrix158springpracticeapp.dto.request;

import lombok.Data;

@Data
public class GroupRequest {
    private String name;
    private Integer capacity;
    private Integer studentCount;
}
