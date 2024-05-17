package com.matrix.matrix158springpracticeapp.service.interfaces;

import com.matrix.matrix158springpracticeapp.dto.request.StudentRequest;
import com.matrix.matrix158springpracticeapp.dto.response.StudentResponseDto;

import java.util.List;


public interface StudentService {

    StudentResponseDto getById(Integer id);
    List<StudentResponseDto> getAll();
    StudentResponseDto add(StudentRequest studentRequest);
    StudentResponseDto update(StudentRequest studentRequest,Integer id);
    void delete(Integer id);
}
