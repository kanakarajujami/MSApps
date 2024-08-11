package com.nt.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationsController {
	@Value("${dbuser}")
	private String user;
	@Value("${password}")
	private String password;
	@GetMapping("/custData")
   public ResponseEntity<String> customerInfo(){
	     return new ResponseEntity<String>("customer info::"+user+"....."+password,HttpStatus.OK);
   }
}
