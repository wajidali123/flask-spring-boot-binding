package com.spring.cloud.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private Environment env;
    @GetMapping("/details")
    public String getServerDetails() throws UnknownHostException {
        String hostName = InetAddress.getLocalHost().getHostAddress();
        return "Hello from "+hostName + " Port "+env.getProperty("server.port");
    }
}
