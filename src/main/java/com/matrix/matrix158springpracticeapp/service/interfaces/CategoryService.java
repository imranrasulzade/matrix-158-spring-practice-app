package com.matrix.matrix158springpracticeapp.service.interfaces;

import com.matrix.matrix158springpracticeapp.dto.request.CategoryRequest;
import com.matrix.matrix158springpracticeapp.dto.response.CategoryResponse;

import java.util.List;

public interface CategoryService{
    CategoryResponse findById(Integer id);
    List<CategoryResponse> findAll();
    CategoryResponse save(CategoryRequest categoryRequest);
    CategoryResponse update(CategoryRequest categoryRequest,Integer id);
    void deleteById(Integer id);
}
