package com.matrix.matrix158springpracticeapp.dto.request;

import com.matrix.matrix158springpracticeapp.entity.Reservation;
import com.matrix.matrix158springpracticeapp.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class StudentRequest {

    private Long userId;
    private String stNumber;
    private String file;
    private Integer status;
    @Size(max = 16, min = 16)
    private String bankAccount;
}
