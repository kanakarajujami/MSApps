package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.consumer.BillingServiceClientComp;

@RestController
@RequestMapping("/shopping-api")
public class ShoppingServiceController {
	@Autowired
  private BillingServiceClientComp clientComp;
	@GetMapping("/purchase")
  public ResponseEntity<String> shopping(){
	  String resultMsg=clientComp.invokeDoPayment1();
	  return new ResponseEntity<String>("shopping is done.."+resultMsg,HttpStatus.OK);
  }
	@GetMapping("/purchase/{cardNo}")
	  public ResponseEntity<String> shopping2(@PathVariable Long cardNo){
		  String resultMsg=clientComp.invokeDoPayment2(cardNo);
		  return new ResponseEntity<String>("shopping is done.."+resultMsg,HttpStatus.OK);
	  }
}
