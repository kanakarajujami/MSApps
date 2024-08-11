package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@EnableScheduling
public class BootMsProjCustomerServiceActuatorsApplication {

	public static void main(String[] args) {
		log.debug("starting of main() method................");
		SpringApplication.run(BootMsProjCustomerServiceActuatorsApplication.class, args);
		log.debug("ending of main() method................");
	}

}
