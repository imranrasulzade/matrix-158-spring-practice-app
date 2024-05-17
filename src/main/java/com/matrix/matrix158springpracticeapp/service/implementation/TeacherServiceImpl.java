package com.matrix.matrix158springpracticeapp.service.implementation;

import com.matrix.matrix158springpracticeapp.dto.request.TeacherRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.TeacherResponseDto;
import com.matrix.matrix158springpracticeapp.entity.Teacher;
import com.matrix.matrix158springpracticeapp.exception.EntityNotFoundException;
import com.matrix.matrix158springpracticeapp.mapper.TeacherMapper;
import com.matrix.matrix158springpracticeapp.repository.TeacherRepository;
import com.matrix.matrix158springpracticeapp.service.interfaces.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;
    private final TeacherMapper teacherMapper;
    @Override
    public Optional<Teacher> findById(Integer id) {
        return teacherRepository.findById(id);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public void deleteById(Integer id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public TeacherResponseDto getById(Integer id) {
        log.info("Action.log -> teacher-service getById method started with id: {}", id);
        TeacherResponseDto teacherResponseDto = teacherRepository.findById(id)
                .map(teacherMapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("teacher not found!"));
        log.info("Action.log -> teacher-service getById method done with id: {}", id);
        return teacherResponseDto;
    }

    @Override
    public void add(TeacherRequestDto teacherRequestDto) {

    }
}
