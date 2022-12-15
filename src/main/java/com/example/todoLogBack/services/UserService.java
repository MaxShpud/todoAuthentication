package com.example.todoLogBack.services;

import com.example.todoLogBack.dto.CategoryDto;
import com.example.todoLogBack.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto save(UserDto user);

    List<UserDto> findAll();

    UserDto findById(Long id);

    void delete(Long id);

    UserDto login(UserDto user);
}
