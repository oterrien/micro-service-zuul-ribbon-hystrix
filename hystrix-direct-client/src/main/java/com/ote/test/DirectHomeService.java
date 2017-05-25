package com.ote.test;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class DirectHomeService {

    @Value("${home-service.host}")
    private String homeServiceHost;

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String directHome() {
        log.info("do_DirectHome");
        String serviceUri = "http://" + homeServiceHost;
        return this.restTemplate.getForObject(serviceUri + "/home", String.class);
    }

    public String fallback() {
        log.info("do_DirectHome");
        return "failure";
    }
}
