package com.ote.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeRestController {

    @Value("${spring.application.name}")
    public String name;

    @Value("${spring.application.instance_id}")
    public String instanceId;

    @RequestMapping("/home")
    public String home() {
        log.info("home");
        return "Hello from " + name + " #" + instanceId;
    }
}