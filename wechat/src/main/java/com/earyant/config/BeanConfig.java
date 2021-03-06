package com.earyant.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by earyant on 2017 : 08 : 2017/8/6 : 11:03 : .
 * ln_spring_boot  com.earyant.config
 */
@Configuration
public class BeanConfig {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
