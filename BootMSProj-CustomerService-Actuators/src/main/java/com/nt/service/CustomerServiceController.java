package com.nt.service;

import java.util.Date;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/customer-api")
@Slf4j
public class CustomerServiceController {
	@GetMapping("/custData")
    public ResponseEntity<String> showCustomerInfo(){
		log.debug("begining of showCustomerInfo().......");
		    int price=new Random().nextInt(1000000);
		    log.debug("ending of showCustomerInfo().......");
    	 return new ResponseEntity<String>("Customer::Mahesh:"+price,HttpStatus.OK);
    	 
    }
	@Scheduled(cron="10 * * * * *")
	public void showReport() {
		 System.out.println("show report::"+new Date());
	}
}
