package com.matrix.matrix158springpracticeapp.service.implementation;

import com.matrix.matrix158springpracticeapp.dto.request.StudentRequest;
import com.matrix.matrix158springpracticeapp.dto.response.StudentResponse;
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
    public StudentResponse getById(Integer id) {
        log.info("Started the get by id operation with id = " + id);
        Student student = studentRepository.findById(id).orElseThrow(() -> {
            log.error("Student with id {} not found ", id);
            return new NoSuchElementException("Not found Student");
        });
        return studentMapper.entityToStudentResponse(student);
    }

    @Override
    public List<StudentResponse> getAll() {
        log.info("Started the get all students!");
        List<Student> students = studentRepository.findAll();
        if (students.isEmpty()){
            log.error("Students not found");
            throw  new NoSuchElementException("Not found students");
        }
        log.info("Successfully " + students);
        return students.stream().map(studentMapper::entityToStudentResponse).collect(Collectors.toList());
    }

    @Override
    public StudentResponse add(StudentRequest studentRequest) {
        log.info("Started add student operation");
        Student student = studentMapper.toEntity(studentRequest);
        User user = userRepository.findById(studentRequest.getUserId()).
                orElseThrow(()-> new NoSuchElementException("User not found with id = " + studentRequest.getUserId()));
        student.setUser(user);
        log.info("Successfully");
        return studentMapper.entityToStudentResponse(studentRepository.save(student));

    }

    @Override
    public StudentResponse update(StudentRequest studentRequest,Integer studentId) {
        log.info("Started update student operation for studentId = {}", studentId);

        Student existingStudent = studentRepository.findById(studentId)
                .orElseThrow(() -> new NoSuchElementException("Student not found with id = " + studentId));

        existingStudent.setStNumber(studentRequest.getStNumber());
        existingStudent.setFile(studentRequest.getFile());
        existingStudent.setStatus(studentRequest.getStatus());
        existingStudent.setBankAccount(studentRequest.getBankAccount());
        log.info("Successfully updated student with id = {}", studentId);
        return studentMapper.entityToStudentResponse(studentRepository.save(existingStudent));
    }

    @Override
    public void delete(Integer id) {
        if (studentRepository.existsById(id)){
            log.info("searched with id = " + id + " student");
            studentRepository.deleteById(id);
        }
    }
}
