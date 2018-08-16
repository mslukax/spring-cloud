package com.rh.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient //服务提供者，客户端
public class RhServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhServiceApplication.class, args);
	}


}
