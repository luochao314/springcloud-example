package com.beone.springcloud.example.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
//@RefreshScope
//@EnableAutoConfiguration
//@MapperScan("com.eugene.student.basic.repository")
public class ExampleUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleUserApplication.class, args);
	}
}
