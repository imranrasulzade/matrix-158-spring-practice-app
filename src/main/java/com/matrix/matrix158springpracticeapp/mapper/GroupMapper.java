package com.matrix.matrix158springpracticeapp.mapper;

import com.matrix.matrix158springpracticeapp.dto.request.GroupRequest;
import com.matrix.matrix158springpracticeapp.entity.Group;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GroupMapper {
    @Mapping(source = "teacher", target = "teacher")
    @Mapping(source = "category", target = "category")
    Group entityToGroupResponse(Group group);
    Group toEntity(GroupRequest groupRequest);
}
