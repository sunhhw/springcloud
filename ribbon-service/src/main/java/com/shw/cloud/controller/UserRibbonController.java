package com.shw.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author shw
 * @version 1.0
 * @date 2021/1/14 15:12
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserRibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.user-service}")
    private String userServiceUrl;

    @GetMapping("/{id}")
    public Object getUser(@PathVariable Long id) {
        return restTemplate.getForObject(userServiceUrl + "/user/{1}",Object.class, id);
    }

    @GetMapping("/getByUsername")
    public Object getByUsername(@RequestParam String username) {
        return restTemplate.getForObject(userServiceUrl + "/user/getByUsername?username={1}", Object.class, username);
    }

    @PostMapping("/delete/{id}")
    public Object delete(@PathVariable Long id) {
        return restTemplate.postForObject(userServiceUrl + "/user/delete/{1}", null, Object.class, id);
    }

}
