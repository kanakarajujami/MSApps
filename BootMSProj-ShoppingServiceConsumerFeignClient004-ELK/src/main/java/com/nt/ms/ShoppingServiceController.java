package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.consumer.BillingServiceClientComp;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/shopping-api")
@Slf4j
public class ShoppingServiceController {
	@Autowired
  private BillingServiceClientComp clientComp;
	@GetMapping("/purchase")
  public ResponseEntity<String> shopping(){
		log.debug("ShoppingServiceController...shopping() started");
	  String resultMsg=clientComp.invokeDoPayment1();
		log.info("Billing Service..method invoked..inokeDoPayement()..");
	  return new ResponseEntity<String>("shopping is done.."+resultMsg,HttpStatus.OK);
  }
	@GetMapping("/purchase/{cardNo}")
	  public ResponseEntity<String> shopping2(@PathVariable Long cardNo){
		log.debug("ShoppingServiceController...shopping2() started");
		  String resultMsg=clientComp.invokeDoPayment2(cardNo);
		  log.info("Billing Service..method invoked with cardNo..inokeDoPayement()2..");
		  return new ResponseEntity<String>("shopping is done.."+resultMsg,HttpStatus.OK);
	  }
}
