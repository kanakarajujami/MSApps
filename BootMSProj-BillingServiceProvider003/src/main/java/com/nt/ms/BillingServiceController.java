package com.nt.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingServiceController {
	@Value("${server.port}")
	private String port;
	@Value("${eureka.instance.instance-id}")
	private String appInstance;
	@GetMapping("/bill")
   public ResponseEntity<String> doPayement(){
	    int billAmt=new Random().nextInt(10000);
	     return  new ResponseEntity<String>("Bill amount is:"+billAmt+"....using debit cards,UPI"+"....."+port+"...."+appInstance,HttpStatus.OK);
   }
	@GetMapping("/bill/{cardNo}")
	   public ResponseEntity<String> doPayement1(@PathVariable Long cardNo){
		    int billAmt=new Random().nextInt(10000);
		     return  new ResponseEntity<String>("Bill amount is:"+billAmt+"....using debit cards,UPI"+"....."+port+"...."+appInstance+"...."+cardNo,HttpStatus.OK);
	   }
}
