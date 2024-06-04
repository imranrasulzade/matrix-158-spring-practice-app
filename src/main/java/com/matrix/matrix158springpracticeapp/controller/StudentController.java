package com.matrix.matrix158springpracticeapp.controller;

import com.matrix.matrix158springpracticeapp.dto.request.StudentRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.StudentResponseDto;
import com.matrix.matrix158springpracticeapp.service.interfaces.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{id}")
    public StudentResponseDto findById(@PathVariable Integer id){
        return studentService.findById(id);
    }

    @GetMapping
    public List<StudentResponseDto> findAll(){
        return studentService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StudentResponseDto save(@RequestBody StudentRequestDto studentRequestDto){
        return studentService.save(studentRequestDto);
    }

    @PutMapping("/{id}")
    public StudentResponseDto update(@RequestBody StudentRequestDto studentRequestDto,@PathVariable Integer id){
        return studentService.update(studentRequestDto,id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        studentService.deleteById(id);
    }

}
