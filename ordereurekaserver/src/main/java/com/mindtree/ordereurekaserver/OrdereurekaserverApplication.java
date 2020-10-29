package com.mindtree.ordereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OrdereurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdereurekaserverApplication.class, args);
	}

}
