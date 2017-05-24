package com.ote.test;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class DirectHomeService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String directHome() {
        log.info("do_DirectHome");
        String serviceUri = "http://localhost:8080";
        return this.restTemplate.getForObject(serviceUri + "/home", String.class);
    }

    public String fallback() {
        log.info("do_DirectHome");
        return "failure";
    }
}
