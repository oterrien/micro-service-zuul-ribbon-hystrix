package com.ote.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class RemoteHomeRestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/service/home")
    public String homeRemote() {

        log.info("homeRemote");
        String gatewayUri = "http://localhost:7070";
        return this.restTemplate.getForObject(gatewayUri + "/service/home", String.class);
    }
}
