package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.consumer.BillingServiceConsumer;

@RestController
@RequestMapping("/shopping-api")
public class ShoppingServiceController {
	@Autowired
  private BillingServiceConsumer consumer;
	@GetMapping("/shopping")
  public ResponseEntity<String> shopping(){
	  String resultMsg=consumer.invokeDoPayment();
	  return new ResponseEntity<String>("shopping is done.."+resultMsg,HttpStatus.OK);
  }
}
