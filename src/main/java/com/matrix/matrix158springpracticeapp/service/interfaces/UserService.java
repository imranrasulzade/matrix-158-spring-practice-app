package com.matrix.matrix158springpracticeapp.service.interfaces;

import com.matrix.matrix158springpracticeapp.dto.request.UserRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.UserResponseDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserResponseDto getById(Integer id);
    List<UserResponseDto> getAll();

    UserResponseDto add(UserRequestDto userRequestDto);

    void update(UserRequestDto userRequestDto,Integer id);

    void deleteById(Integer id);

}
