package com.example.mimari01.service.impl;

import com.example.mimari01.dto.UserDto;
import com.example.mimari01.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService { //UserService interface`i implament edilir ve islemler orda yapilip burda override edilir.
    @Override
    public UserDto getUserById(Long userId) {
        return null;
    }
}
