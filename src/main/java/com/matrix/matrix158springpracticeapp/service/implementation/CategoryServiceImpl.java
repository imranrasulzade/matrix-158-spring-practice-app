package com.matrix.matrix158springpracticeapp.service.implementation;

import com.matrix.matrix158springpracticeapp.dto.request.CategoryRequestDto;
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
    public CategoryResponse findById(Integer id) {
        log.info("Started the get by id operation with id = {}", id);
        Category category = categoryRepository.findById(id).
                orElseThrow(() -> {
                    log.error("Category with id {} not found ", id);
                    return new NoSuchElementException("Not found category");
                });
        return categoryMapper.entityToCategoryResponse(category);
    }

    @Override
    public List<CategoryResponse> findAll() {
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
    public CategoryResponse save(CategoryRequestDto categoryRequestDto) {
        Category category = categoryMapper.toEntity(categoryRequestDto);
        return categoryMapper.entityToCategoryResponse(categoryRepository.save(category));
    }

    @Override
    public CategoryResponse update(CategoryRequestDto categoryRequestDto, Integer id) {
        Category existingCategory = categoryRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Category not found"));
        existingCategory.setName(categoryRequestDto.getName());
        existingCategory.setSyllabusPath(categoryRequestDto.getName());
        existingCategory.setStatus(categoryRequestDto.getStatus());
        existingCategory.setAmount(categoryRequestDto.getAmount());
        existingCategory.setCurrency(categoryRequestDto.getCurrency());

        Category updatedCategory = categoryRepository.save(existingCategory);
        log.info("Category updated: {}", updatedCategory);
        return categoryMapper.entityToCategoryResponse(updatedCategory);
    }

    @Override
    public void deleteById(Integer id) {
        log.info("Deleting category with id = {}", id);
        if (!categoryRepository.existsById(id)) {
            log.error("Category with id {} not found", id);
            throw new NoSuchElementException("Category not found");
        }
        categoryRepository.deleteById(id);
        log.info("Category deleted successfully");
    }
}
