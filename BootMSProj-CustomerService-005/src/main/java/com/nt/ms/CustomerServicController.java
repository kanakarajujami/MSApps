package com.nt.ms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/customer-api")
public class CustomerServicController {
	@GetMapping("/custData")
	public ResponseEntity<String> showCustomerInfo(){
		return new ResponseEntity<String>("Customer Operations",HttpStatus.OK);
	}

}
