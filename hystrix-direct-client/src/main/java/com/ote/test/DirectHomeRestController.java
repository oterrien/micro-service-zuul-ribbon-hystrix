package com.ote.test;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class DirectHomeRestController {

    @Autowired
    private DirectHomeService directHomeService;

    @RequestMapping("/direct/home")
    public String directHome() {

        log.info("directHome");
        return directHomeService.directHome();
    }


}
