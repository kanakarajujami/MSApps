package com.nt.service;

import java.util.Random;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankOperationsController {
	 @GetMapping("/welcome")
	  public ResponseEntity<String> showHomePage(){
		  return new ResponseEntity<String>("Welcome to Kotak Bank",HttpStatus.OK);
	  }
	 @GetMapping("/offers")
    public ResponseEntity<String> offersPage(){
    	 return new ResponseEntity<String>("10% interest Personal loan",HttpStatus.OK);
    }
	 @GetMapping("/balance")
	 @PreAuthorize("hasAnyAuthority('customer','manager')")
	 public ResponseEntity<String> showBalance(){
		 int amount=new Random().nextInt(100000);
		 return new ResponseEntity<String>("account balance:"+amount,HttpStatus.OK);
	 }
	 @GetMapping("/loan")
	 @PreAuthorize("hasAuthority('manager')")
	 public ResponseEntity<String> loanApproval(){
		 int amount=new Random().nextInt(700000);
		 return new ResponseEntity<String>("loan approved, amount is:"+amount,HttpStatus.OK);
	 }
}
