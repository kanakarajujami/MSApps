package com.nt.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumer {
	@Autowired
   private LoadBalancerClient client;
   public String invokeDoPayment() {
	   //getting instance representing  billing service instances which have less load factor
	     ServiceInstance instance=client.choose("billing-service");
	   //prepare url by getting uri
	   String url=instance.getUri()+"/billing-api/bill";
	   //create rest template to send to request to biiling service
	   RestTemplate template=new RestTemplate();
	   String msg=template.getForObject(url, String.class);
	   return msg;
	   
	   
   }//end of method
} 
