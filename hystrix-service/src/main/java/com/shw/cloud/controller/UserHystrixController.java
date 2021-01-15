package com.shw.cloud.controller;

import java.lang.reflect.Parameter;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shw.cloud.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shw
 * @version 1.0
 * @date 2021/1/15 16:48
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserHystrixController {

    @Autowired
    private ServiceImpl service;

    @GetMapping("/testFallback/{id}")
    public String getUser(@PathVariable Long id) {
        return service.getUser(id);
    }

}
