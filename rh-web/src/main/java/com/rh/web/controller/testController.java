package com.rh.web.controller;

import com.rh.web.service.FeignService;
import com.rh.web.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @Autowired
    RibbonService ribbonService;

    @Autowired
    FeignService feignService;

    //GetMapping值为调用微服务地址（service）
    @GetMapping(value="/service-test")
    public String test(){
        return ribbonService.ribbonService();
    }

    //使用Feign直接Feign定义的接口，而无需实现它
    @RequestMapping(value="/service-test2",method = RequestMethod.GET)
    public String test2(){
        return feignService.GetServiceMsg();
    }

}
