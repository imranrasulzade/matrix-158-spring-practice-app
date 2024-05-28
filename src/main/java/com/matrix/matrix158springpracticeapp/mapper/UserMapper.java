package com.matrix.matrix158springpracticeapp.mapper;

import com.matrix.matrix158springpracticeapp.dto.request.UserRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.UserResponseDto;
import com.matrix.matrix158springpracticeapp.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    @Mapping(source = "user",target = "fullName",qualifiedByName = "mapFullName")
    public abstract UserResponseDto toUserResponseDto(User user);
    public abstract User toUser(UserRequestDto userRequestDto);

    @Named("mapFullName")
    public String mapFullName(User user){
        return user.getName()+" "+user.getSurname();
    }

}
