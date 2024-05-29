package com.amir.spring_security.dto;

import com.amir.spring_security.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDto {

    private User user;

    private String jwt;
    
}
