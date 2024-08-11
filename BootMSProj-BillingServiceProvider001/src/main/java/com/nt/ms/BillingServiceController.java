package com.nt.ms;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingServiceController {
	@GetMapping("/bill")
   public ResponseEntity<String> doPayement(){
	    int billAmt=new Random().nextInt(10000);
	     return  new ResponseEntity<String>("Bill amount is:"+billAmt+"....using debit cards,UPI",HttpStatus.OK);
   }
}
