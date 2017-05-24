package com.ote.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Server {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Server.class).run(args);
    }
}