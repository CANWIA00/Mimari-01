package com.example.mimari01.controller;

import com.example.mimari01.dto.UserDto;
import com.example.mimari01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired // Service classinin implament ettigi interface icindeki methodlari otomatik almak icin kullanilir.
    private UserService userService;


    // Dto clasinda olusturdugumuz nesneler get mapping ile aldigimiz verilere atanir ve servis classina islem gormek icin gonderilir.
    @GetMapping("/users/{userId}")
    public UserDto getUserById(@PathVariable("userId") Long userId){
        return userService.getUserById(userId);
    }
}
