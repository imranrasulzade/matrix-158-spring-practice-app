package com.matrix.matrix158springpracticeapp.service.interfaces;

import com.matrix.matrix158springpracticeapp.dto.request.StudentRequest;
import com.matrix.matrix158springpracticeapp.dto.response.StudentResponse;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    StudentResponse getById(Integer id);
    List<StudentResponse> getAll();
    StudentResponse add(StudentRequest studentRequest);
    StudentResponse update(StudentRequest studentRequest,Integer id);
    void delete(Integer id);
}
