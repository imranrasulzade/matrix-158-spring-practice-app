package com.matrix.matrix158springpracticeapp.service.interfaces;

import com.matrix.matrix158springpracticeapp.dto.request.StudentRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.StudentResponseDto;

import java.util.List;


public interface StudentService {
    StudentResponseDto findById(Integer id);
    List<StudentResponseDto> findAll();
    StudentResponseDto save(StudentRequestDto studentRequestDto);
    StudentResponseDto update(StudentRequestDto studentRequestDto, Integer id);
    void deleteById(Integer id);
}
