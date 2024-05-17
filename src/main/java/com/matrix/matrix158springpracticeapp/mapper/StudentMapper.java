package com.matrix.matrix158springpracticeapp.mapper;

import com.matrix.matrix158springpracticeapp.dto.request.StudentRequest;
import com.matrix.matrix158springpracticeapp.dto.response.StudentResponseDto;
import com.matrix.matrix158springpracticeapp.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class StudentMapper {

    @Mapping(source = "user.name", target = "name")
    @Mapping(source = "user.surname", target = "surname")
    public abstract StudentResponseDto toDTO(Student student);
    public abstract Student toEntity (StudentRequest studentRequest);
}
