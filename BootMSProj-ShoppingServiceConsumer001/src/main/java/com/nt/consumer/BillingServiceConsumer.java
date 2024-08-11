package com.nt.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumer {
	@Autowired
   private DiscoveryClient client;
   public String invokeDoPayment() {
	   //getting instances representing  billing service instances
	   List<ServiceInstance> listInstances=client.getInstances("billing-service");
	   //get single instance
	   ServiceInstance instance=listInstances.get(0);
	   //prepare url by getting uri
	   String url=instance.getUri()+"/billing-api/bill";
	   //create rest template to send to request to biiling service
	   RestTemplate template=new RestTemplate();
	   String msg=template.getForObject(url, String.class);
	   return msg;
	   
	   
   }//end of method
} 
