package com.matrix.matrix158springpracticeapp.service.implementation;

import com.matrix.matrix158springpracticeapp.dto.request.StudentRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.StudentResponseDto;
import com.matrix.matrix158springpracticeapp.entity.Student;
import com.matrix.matrix158springpracticeapp.entity.User;
import com.matrix.matrix158springpracticeapp.mapper.StudentMapper;
import com.matrix.matrix158springpracticeapp.repository.StudentRepository;
import com.matrix.matrix158springpracticeapp.repository.UserRepository;
import com.matrix.matrix158springpracticeapp.service.interfaces.StudentService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Data
@Slf4j
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    private final UserRepository userRepository;


    @Override
    public StudentResponseDto findById(Integer id) {
        log.info("Started the get by id operation with id = " + id);
        Student student = studentRepository.findById(id).orElseThrow(() -> {
            log.error("Student with id {} not found ", id);
            return new NoSuchElementException("Not found Student");
        });
        return studentMapper.toDTO(student);
    }

    @Override
    public List<StudentResponseDto> findAll() {
        log.info("Started the get all students!");
        List<Student> students = studentRepository.findAll();
        if (students.isEmpty()){
            log.error("Students not found");
            throw  new NoSuchElementException("Not found students");
        }
        List<StudentResponseDto> responseDtoList = students.stream().map(studentMapper::toDTO).collect(Collectors.toList());
        log.info("Successfully " + students);
        return responseDtoList;
    }

    @Override
    public StudentResponseDto save(StudentRequestDto studentRequestDto) {
        log.info("Started add student operation");
        Student student = new Student();
        studentMapper.toEntity(student,studentRequestDto);
        User user = userRepository.findById(studentRequestDto.getUserId()).
                orElseThrow(()-> new NoSuchElementException("User not found with id = " + studentRequestDto.getUserId()));
        student.setUser(user);
        StudentResponseDto studentResponseDto = studentMapper.toDTO(studentRepository.save(student));
        log.info("Successfully");
        return studentResponseDto;

    }

    @Override
    public StudentResponseDto update(StudentRequestDto studentRequestDto, Integer studentId) {
        log.info("Started update student operation for studentId = {}", studentId);
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new NoSuchElementException("Student not found with id = " + studentId));

        studentMapper.toEntity(student,studentRequestDto);

        StudentResponseDto responseDto = studentMapper.toDTO(student);

        log.info("Successfully updated student with id = {}", studentId);
        return responseDto;
    }

    @Override
    public void deleteById(Integer id) {
        if (studentRepository.existsById(id)){
            log.info("searched with id = " + id + " student");
            studentRepository.deleteById(id);
        }
    }
}
