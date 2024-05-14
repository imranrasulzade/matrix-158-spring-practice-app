package com.matrix.matrix158springpracticeapp.mapper;

import com.matrix.matrix158springpracticeapp.dto.request.CategoryRequest;
import com.matrix.matrix158springpracticeapp.dto.response.CategoryResponse;
import com.matrix.matrix158springpracticeapp.entity.Category;
import lombok.Data;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class CategoryMapper {
    public abstract CategoryResponse entityToCategoryResponse(Category category);
    public abstract Category toEntity(CategoryRequest categoryRequest);

}
