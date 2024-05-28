package com.matrix.matrix158springpracticeapp.service.interfaces;

import com.matrix.matrix158springpracticeapp.dto.request.StudentRequest;
import com.matrix.matrix158springpracticeapp.dto.response.StudentResponseDto;

import java.util.List;


public interface StudentService {
    StudentResponse findById(Integer id);
    List<StudentResponse> findAll();
    StudentResponse save(StudentRequest studentRequest);
    StudentResponse update(StudentRequest studentRequest,Integer id);
    void deleteById(Integer id);
}
