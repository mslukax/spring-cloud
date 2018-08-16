package com.rh.regist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RhRegistApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhRegistApplication.class, args);
	}
}
