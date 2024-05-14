package com.matrix.matrix158springpracticeapp.mapper;

import com.matrix.matrix158springpracticeapp.dto.request.StudentRequest;
import com.matrix.matrix158springpracticeapp.dto.response.StudentResponse;
import com.matrix.matrix158springpracticeapp.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class StudentMapper {
    public abstract StudentResponse entityToStudentResponse(Student student);
    public abstract Student toEntity (StudentRequest studentRequest);
}
