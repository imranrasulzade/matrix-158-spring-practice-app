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
        log.info("Request to find category by id: {}", id);
        return categoryService.findById(id);
    }

    @GetMapping
    public List<CategoryResponse> findAll() {
        log.info("Request to find all categories");
        return categoryService.findAll();
    }

    @PostMapping
    public CategoryResponse save(@RequestBody CategoryRequestDto categoryRequestDto) {
        log.info("Request to save category: {}", categoryRequestDto);
        return categoryService.save(categoryRequestDto);
    }

    @PutMapping("/{id}")
    public CategoryResponse update(@RequestBody CategoryRequestDto categoryRequestDto, @PathVariable Integer id) {
        log.info("Request to update category with id: {}, data: {}", id, categoryRequestDto);
        return categoryService.update(categoryRequestDto, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("Request to delete category with id: {}", id);
        categoryService.deleteById(id);
    }
}

