package com.rh.web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//Feign伪Http客户端,简化客户端请求，并且负载均衡
@FeignClient(value="rh-service", fallback = HystricService.class) //服务名称
@Service
public interface FeignService {
    @RequestMapping(value = "/service-test2",method = RequestMethod.GET)//微服务名称
    String GetServiceMsg();
}

