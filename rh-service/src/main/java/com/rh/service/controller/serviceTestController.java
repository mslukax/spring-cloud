package com.rh.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class serviceTestController {
    @RequestMapping("/service-test")
    public String serviceTest(){
        return "service:test";
    }

    @RequestMapping("/service-test2")
    public String serviceTest2(){
        return "service:test2";
    }

    @RequestMapping("/service-test3")
    public String serviceTest3(){
        return "service:test3";
    }
}
