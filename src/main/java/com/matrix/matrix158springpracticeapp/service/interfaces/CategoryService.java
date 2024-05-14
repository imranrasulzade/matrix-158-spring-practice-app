package com.matrix.matrix158springpracticeapp.service.interfaces;

import com.matrix.matrix158springpracticeapp.dto.request.CategoryRequest;
import com.matrix.matrix158springpracticeapp.dto.request.StudentRequest;
import com.matrix.matrix158springpracticeapp.dto.response.CategoryResponse;
import com.matrix.matrix158springpracticeapp.dto.response.StudentResponse;

import java.util.List;

public interface CategoryService{
    CategoryResponse getById(Integer id);
    List<CategoryResponse> getAll();
    CategoryResponse add(CategoryRequest categoryRequest);
    CategoryResponse update(CategoryRequest categoryRequest,Integer id);
    void delete(Integer id);
}
