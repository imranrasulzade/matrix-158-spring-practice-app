package com.matrix.matrix158springpracticeapp.controller;

import com.matrix.matrix158springpracticeapp.dto.request.UserRequestDto;
import com.matrix.matrix158springpracticeapp.dto.response.UserResponseDto;
import com.matrix.matrix158springpracticeapp.service.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public UserResponseDto getById(@PathVariable Integer id){
        return userService.getById(id);
    }

    @GetMapping
    public List<UserResponseDto> getAll(){
        return userService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDto add(@RequestParam UserRequestDto userRequestDto){
        return userService.add(userRequestDto);
    }

    @PutMapping("/{id}")
    public void update(UserRequestDto userRequestDto,@PathVariable Integer id){
        userService.update(userRequestDto,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        userService.deleteById(id);
    }
}
