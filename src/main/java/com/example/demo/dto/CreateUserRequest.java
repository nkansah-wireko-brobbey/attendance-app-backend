package com.example.demo.dto;

import jakarta.annotation.Nullable;
import lombok.Data;
import jakarta.validation.constraints.*;

@Data
public class CreateUserRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String rfUid;

    @Email
    private String email;

    private String phone;
}
