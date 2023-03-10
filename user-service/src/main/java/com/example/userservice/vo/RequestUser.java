package com.example.userservice.vo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class RequestUser {
    @NotNull(message= "Email cannot be null")
    @Size(min=2, message= "Email not be less than two characters")
    @Email
    private String email;

    @NotNull(message= "name cannot be null")
    @Size(min=2, message= "name not be less than two characters")
    private String name;

    @NotNull(message= "pwd cannot be null")
    @Size(min=8, message= "pwd not be gte than 8 characters")
    private String pwd;
}
