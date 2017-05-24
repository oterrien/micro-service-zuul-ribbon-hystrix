package com.ote.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker
@SpringBootApplication
public class DirectClient {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DirectClient.class).run(args);
    }

    @Bean
    public RestTemplate rest(RestTemplateBuilder builder) {
        return builder.build();
    }
}