package com.shw.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shw
 * @version 1.0
 * @date 2021/1/14 14:57
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id) {
        String msg = "This is getUser " + id;
        return msg;
    }

    @GetMapping("/hello")
    public String hello() {
        //LOGGER.info("负载均衡===8201");
        LOGGER.info("负载均衡===8202");
        return "Hello1";
    }


    @GetMapping("/getUserByIds")
    public Object getUserByIds(@RequestParam List<Long> ids) {
        String msg = "This is getUserByIds " + ids;
        return msg;
    }

    @GetMapping("/getByUsername")
    public Object getByUsername(@RequestParam String username) {
        String msg = "This is getByUsername" + username;
        return msg;
    }

    @PostMapping("/delete/{id}")
    public Object delete(@PathVariable Long id) {
        String msg = "This is /delete/{id}" + id;
        return msg;
    }
}
