package com.eureka.server;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class RegistryServerApplication {

	@RequestMapping("/user")
	public Principal user(Principal principal) {
		return principal;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RegistryServerApplication.class, args);
	}
}
