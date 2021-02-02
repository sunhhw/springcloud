package com.shw.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shw
 * @version 1.0
 * @date 2021/2/2 16:40
 * @description
 */
@RestController
public class NacosUserController {

    @GetMapping("/ceshi/{str}")
    public String hello(@PathVariable("str") String str) {
        return "hello2" + str;
    }

}
