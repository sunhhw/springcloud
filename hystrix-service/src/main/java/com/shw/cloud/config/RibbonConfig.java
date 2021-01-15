package com.shw.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author shw
 * @version 1.0
 * @date 2021/1/14 15:12
 * @description
 */
@Configuration
public class RibbonConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
