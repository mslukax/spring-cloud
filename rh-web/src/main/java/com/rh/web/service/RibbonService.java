package com.rh.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;
    public String ribbonService(){ //调用服务提供者服务（service），url = http://服务名称/微服务名称/
        return restTemplate.getForObject("http://RH-SERVICE/service-test", String.class);
    }
}
