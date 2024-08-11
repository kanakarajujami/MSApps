package com.nt.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("billing-service")
public  interface  BillingServiceClientComp {
	 @GetMapping("/billing-api/bill")
	 public String invokeDoPayment1();

@GetMapping("/billing-api/bill/{cardNo}")
public String invokeDoPayment2(@PathVariable Long cardNo);
} 
