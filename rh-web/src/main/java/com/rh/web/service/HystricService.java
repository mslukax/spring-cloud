package com.rh.web.service;

import org.springframework.stereotype.Component;

@Component
public class HystricService implements FeignService {
    @Override
    public String GetServiceMsg(){
    return "断路器启动";
}
}
