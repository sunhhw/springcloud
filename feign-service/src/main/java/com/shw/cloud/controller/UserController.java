package com.shw.cloud.controller;

import com.shw.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shw
 * @version 1.0
 * @date 2021/1/18 16:55
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/testFallback/{id}")
    public String getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/testHello")
    public String testHello() {
        return userService.testHello();
    }
}
