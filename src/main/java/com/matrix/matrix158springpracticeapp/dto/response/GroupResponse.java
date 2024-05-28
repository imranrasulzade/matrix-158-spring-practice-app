package com.matrix.matrix158springpracticeapp.dto.response;

import lombok.Data;

@Data
public class GroupResponse {
    private String name;
    private Integer capacity;
    private Integer studentCount;
  private   TeacherResponseDto  teacher;
  private CategoryResponse category;
}
