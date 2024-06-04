package com.matrix.matrix158springpracticeapp.controller;

import com.matrix.matrix158springpracticeapp.dto.request.TeacherRequestDto;
import com.matrix.matrix158springpracticeapp.dto.request.UserRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.TeacherResponseDto;
import com.matrix.matrix158springpracticeapp.service.interfaces.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("teacher")
public class TeacherController {
    private final TeacherService service;

    @GetMapping("{id}")
    public TeacherResponseDto findById(@PathVariable Integer id){
        return service.getById(id);
    }

    @GetMapping
    public List<TeacherResponseDto> getAll(){
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TeacherResponseDto add(@RequestBody TeacherRequestDto teacherRequestDto){
        return service.add(teacherRequestDto);
    }

    @PutMapping("/{id}")
    public TeacherResponseDto update(@PathVariable Integer id, @RequestBody TeacherRequestDto teacherRequestDto){
        return service.update(id,teacherRequestDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }



}
