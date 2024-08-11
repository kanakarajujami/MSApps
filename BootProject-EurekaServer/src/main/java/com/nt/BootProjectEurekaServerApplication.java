package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class BootProjectEurekaServerApplication {

	public static void main(String[] args) {
		log.debug("Main() method start...Eureka server");
		SpringApplication.run(BootProjectEurekaServerApplication.class, args);
		log.debug("Main() method end....Eureka server ");
	}

}
