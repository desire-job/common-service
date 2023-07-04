package com.gmail.apachdima.desirejob.commonservice.config;

import feign.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonFeignConfig {

    @Bean
    public Client feignClient() {
        return new Client.Default(null, null);
    }
}
