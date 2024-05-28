package com.matrix.matrix158springpracticeapp.dto.request;

import lombok.Data;

@Data
public class UserRequestDto {
    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;
}
