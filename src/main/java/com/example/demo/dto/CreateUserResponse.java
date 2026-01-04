package com.example.demo.dto;

import com.example.demo.domain.User;
import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public class CreateUserResponse {

    private Long id;

    private String name;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String email;

    private String phone;

    public static CreateUserResponse from(User user){
        CreateUserResponse userResponse = new CreateUserResponse();

        userResponse.setName(user.getName());
        userResponse.setId(user.getId());
        userResponse.setCreatedAt(user.getCreatedAt());
        userResponse.setUpdatedAt(user.getUpdatedAt());
        userResponse.setEmail(user.getEmail());
        userResponse.setPhone(user.getPhone());

        return userResponse;
    }
}
