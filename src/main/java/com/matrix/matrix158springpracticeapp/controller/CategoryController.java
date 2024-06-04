package com.matrix.matrix158springpracticeapp.controller;

import com.matrix.matrix158springpracticeapp.dto.request.CategoryRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.CategoryResponse;
import com.matrix.matrix158springpracticeapp.service.interfaces.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
@Slf4j
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/{id}")
    public CategoryResponse findById(@PathVariable Integer id) {
        return categoryService.findById(id);
    }

    @GetMapping
    public List<CategoryResponse> findAll() {
        return categoryService.findAll();
    }

    @PostMapping
    public CategoryResponse save(@RequestBody CategoryRequestDto categoryRequestDto) {
        return categoryService.save(categoryRequestDto);
    }

    @PutMapping("/{id}")
    public CategoryResponse update(@RequestBody CategoryRequestDto categoryRequestDto, @PathVariable Integer id) {
        return categoryService.update(categoryRequestDto, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        categoryService.deleteById(id);
    }
}

