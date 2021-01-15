package com.shw.cloud.controller;

import com.shw.cloud.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    private ServiceImpl service;

    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id) {
        return restTemplate.getForObject(userServiceUrl + "/user/{1}", String.class, id);
    }

    @GetMapping("/hi")
    public String getHi() {
        return service.getHi();
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
