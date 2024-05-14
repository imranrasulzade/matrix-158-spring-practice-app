package com.matrix.matrix158springpracticeapp.service.implementation;

import com.matrix.matrix158springpracticeapp.dto.request.CategoryRequest;
import com.matrix.matrix158springpracticeapp.dto.response.CategoryResponse;
import com.matrix.matrix158springpracticeapp.entity.Category;
import com.matrix.matrix158springpracticeapp.mapper.CategoryMapper;
import com.matrix.matrix158springpracticeapp.repository.CategoryRepository;
import com.matrix.matrix158springpracticeapp.service.interfaces.CategoryService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Slf4j
@Data
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public CategoryResponse getById(Integer id) {
        log.info("Started the get by id operation with id = {}", id);
        Category category = categoryRepository.findById(id).
                orElseThrow(() -> {
                    log.error("Category with id {} not found ", id);
                    return new NoSuchElementException("Not found category");
                });
        return categoryMapper.entityToCategoryResponse(category);
    }

    @Override
    public List<CategoryResponse> getAll() {
        log.info("Started the get all categories!");
        List<Category> categories = categoryRepository.findAll();
        if (categories.isEmpty()) {
            log.error("Categories not found");
            throw new NoSuchElementException("Not found categories");
        }
        log.info("Successfully " + categories);
        return categories.stream().map(categoryMapper::entityToCategoryResponse).collect(Collectors.toList());
    }

    @Override
    public CategoryResponse add(CategoryRequest categoryRequest) {
        Category category = categoryMapper.toEntity(categoryRequest);
        return categoryMapper.entityToCategoryResponse(categoryRepository.save(category));
    }

    @Override
    public CategoryResponse update(CategoryRequest categoryRequest, Integer id) {
        Category existingCategory = categoryRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Category not found"));
        existingCategory.setName(categoryRequest.getName());
        existingCategory.setSyllabusPath(categoryRequest.getName());
        existingCategory.setStatus(categoryRequest.getStatus());
        existingCategory.setAmount(categoryRequest.getAmount());
        existingCategory.setCurrency(categoryRequest.getCurrency());

        Category updatedCategory = categoryRepository.save(existingCategory);
        log.info("Category updated: {}", updatedCategory);
        return categoryMapper.entityToCategoryResponse(updatedCategory);
    }

    @Override
    public void delete(Integer id) {
        log.info("Deleting category with id = {}", id);
        if (!categoryRepository.existsById(id)) {
            log.error("Category with id {} not found", id);
            throw new NoSuchElementException("Category not found");
        }
        categoryRepository.deleteById(id);
        log.info("Category deleted successfully");
    }
}