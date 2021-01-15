package com.shw.cloud.service;

import cn.hutool.http.HttpUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

/**
 * @author shw
 * @version 1.0
 * @date 2021/1/15 16:54
 * @description
 */
@Service
public class ServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.user-service}")
    private String userServiceUrl;

    /**
     * 当这个方法出现问题的时候，就会去调用getDefaultHello()这个方法
     * getDefaultHello() 方法的参数跟这个方法一致即可
     *
     * @return
     */
    //@HystrixCommand(fallbackMethod = "getDefaultUser")
    public String getUser(Long id) {
        String forObject = restTemplate.getForObject(userServiceUrl + "/user/{1}", String.class, id);
        return forObject;
    }

    public String getDefaultUser(Long id) {
        return "getDefaultUser==" + id;
    }



}
