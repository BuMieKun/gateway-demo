package com.demo.controller;

import com.demo.service.OrderServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private OrderServiceProvider orderServiceProvider;

    @GetMapping("/hello")
    public String hello(){
        return orderServiceProvider.hello();
    }
}
