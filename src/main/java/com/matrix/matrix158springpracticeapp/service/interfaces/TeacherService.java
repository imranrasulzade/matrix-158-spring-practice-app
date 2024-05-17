package com.matrix.matrix158springpracticeapp.service.interfaces;

import com.matrix.matrix158springpracticeapp.dto.request.TeacherRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.TeacherResponseDto;
import com.matrix.matrix158springpracticeapp.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {
    Optional<Teacher> findById(Integer id);
    List<Teacher> findAll();
    Teacher save(Teacher teacher);
    void deleteById(Integer id);

    TeacherResponseDto getById(Integer id);

    void add(TeacherRequestDto teacherRequestDto);

}
