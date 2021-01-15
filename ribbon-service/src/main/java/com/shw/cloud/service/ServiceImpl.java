package com.shw.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author shw
 * @version 1.0
 * @date 2021/1/15 18:34
 * @description
 */
@Service
public class ServiceImpl  {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.user-service}")
    private String userServiceUrl;

    public String getHi() {
        return restTemplate.getForObject(userServiceUrl + "/user/hello", String.class);
    }
}
