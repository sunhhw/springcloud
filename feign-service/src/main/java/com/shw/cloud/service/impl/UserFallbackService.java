package com.shw.cloud.service.impl;

import com.shw.cloud.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author shw
 * @version 1.0
 * @date 2021/1/18 17:23
 * @description
 */
@Component
public class UserFallbackService implements UserService {

    @Override
    public String getUser(Long id) {
        return "Default ID";
    }

    @Override
    public String testHello() {
        return "Default Hello";
    }

}
