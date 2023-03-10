package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestLogin {
    @NotNull(message = "email cannot b e null")
    @Size(min=2, message= "email not b e less than two characters")
    @Email
    private String email;
    @NotNull(message = "password cannot b e null")
    @Size(min=8, message= "password not b e less than 8 characters")
    private String password;
}
