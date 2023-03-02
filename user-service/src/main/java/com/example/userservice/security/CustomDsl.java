package com.example.userservice.security;

import com.example.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

@RequiredArgsConstructor
public class CustomDsl extends AbstractHttpConfigurer<CustomDsl, HttpSecurity> {
    private final UserService userService;
    private final Environment env;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        AuthenticationManager authenticationManager = http.getSharedObject(AuthenticationManager.class);
        AuthenticationFilter authenticationFilter = new AuthenticationFilter(authenticationManager, userService, env);
        http.addFilter(authenticationFilter);
    }

}
