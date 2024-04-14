package com.thirdPartyApi.configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class ApplicationConfiguration {

    @Bean
    public RestTemplate createRestTempelate(){
        return new RestTemplateBuilder().build();
    }
}
