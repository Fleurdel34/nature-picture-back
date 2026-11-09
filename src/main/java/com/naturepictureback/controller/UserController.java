package com.naturepictureback.controller;

import com.naturepictureback.models.User;
import com.naturepictureback.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("auth")
public class UserController {

    @Autowired
    private final UserService userService;

    @PostMapping("register")
    public void register(@RequestBody User user) {
      this.userService.register(user);
    }
}
