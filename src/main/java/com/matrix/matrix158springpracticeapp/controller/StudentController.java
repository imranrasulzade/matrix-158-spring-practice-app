package com.matrix.matrix158springpracticeapp.controller;

import com.matrix.matrix158springpracticeapp.dto.request.StudentRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.StudentResponseDto;
import com.matrix.matrix158springpracticeapp.service.interfaces.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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



    @Operation(
            summary = "Retrieve all",
            description = "just descriptions for stuednt",
            tags = {"tutorials", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = StudentResponseDto.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
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
