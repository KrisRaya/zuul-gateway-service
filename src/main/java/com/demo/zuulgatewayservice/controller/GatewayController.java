package com.demo.zuulgatewayservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @GetMapping("/")
    public String gateway() {
        return "Gateway service is up";
    }
}
