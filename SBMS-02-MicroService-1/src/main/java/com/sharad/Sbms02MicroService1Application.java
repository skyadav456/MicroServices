package com.sharad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Sbms02MicroService1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sbms02MicroService1Application.class, args);
	}

}
