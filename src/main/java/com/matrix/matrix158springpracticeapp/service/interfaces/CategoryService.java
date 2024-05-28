package com.matrix.matrix158springpracticeapp.service.interfaces;

import com.matrix.matrix158springpracticeapp.dto.request.CategoryRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.CategoryResponse;

import java.util.List;

public interface CategoryService{
    CategoryResponse findById(Integer id);
    List<CategoryResponse> findAll();
    CategoryResponse save(CategoryRequestDto categoryRequestDto);
    CategoryResponse update(CategoryRequestDto categoryRequestDto, Integer id);
    void deleteById(Integer id);
}
