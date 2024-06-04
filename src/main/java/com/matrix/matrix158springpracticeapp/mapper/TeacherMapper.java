package com.matrix.matrix158springpracticeapp.mapper;

import com.matrix.matrix158springpracticeapp.dto.request.TeacherRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.TeacherResponseDto;
import com.matrix.matrix158springpracticeapp.entity.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class TeacherMapper {
    public abstract Teacher toEntity(TeacherRequestDto teacherRequestDto);

    @Mapping(source = "user.name", target = "name")
    @Mapping(source = "user.surname", target = "surname")
    public abstract TeacherResponseDto toDTO(Teacher teacher);
}
