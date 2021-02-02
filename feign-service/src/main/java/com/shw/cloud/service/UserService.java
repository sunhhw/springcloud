package com.shw.cloud.service;

import com.shw.cloud.service.impl.UserFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author shw
 * @version 1.0
 * @date 2021/1/18 16:55
 * @description
 */
@FeignClient(value = "user-service", fallback = UserFallbackService.class)
public interface UserService {

    // 这里的接口写提供方的接口
    @GetMapping("/user/{id}")
    String getUser(@PathVariable Long id);

    @GetMapping("/user/hello")
    String testHello();

}
