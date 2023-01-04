package com.demo.service.Impl;

import com.demo.service.OrderServiceProvider;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService(group = "orderService", version = "1.0.0")
@Service
public class OrderServiceProviderImpl implements OrderServiceProvider {

    @Override
    public String hello() {
        return "hello gateway i'm passenger-api";
    }
}
