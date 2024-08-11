package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@Slf4j
public class BootMsProjShoppingServiceConsumerFleignClient003Application {

	public static void main(String[] args) {
		log.debug("Shopping Service..main() method start..");
		SpringApplication.run(BootMsProjShoppingServiceConsumerFleignClient003Application.class, args);
		log.debug("Shopping service ..main() method end");
	}

}
