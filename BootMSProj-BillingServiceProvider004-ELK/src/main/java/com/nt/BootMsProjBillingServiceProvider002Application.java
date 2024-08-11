package com.nt;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@Slf4j
public class BootMsProjBillingServiceProvider002Application {
   
	public static void main(String[] args) {
		 log.debug("BillingServiceProvider..main() started..");
		SpringApplication.run(BootMsProjBillingServiceProvider002Application.class, args);
		 log.debug("BillingServiceProvider..main() ended..");
	}

}
