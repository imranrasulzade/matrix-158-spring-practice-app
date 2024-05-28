package com.matrix.matrix158springpracticeapp.controller;

import com.matrix.matrix158springpracticeapp.dto.request.TeacherRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.TeacherResponseDto;
import com.matrix.matrix158springpracticeapp.service.interfaces.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("teacher")
public class TeacherController {
    private final TeacherService service;

    @GetMapping("{id}")
    public TeacherResponseDto getById(@PathVariable Integer id){
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void getById(@RequestBody TeacherRequestDto teacherRequestDto){
        service.add(teacherRequestDto);
    }
}
