package com.nt.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankOperationsController {
	@GetMapping("/")
   public String showHomePage() {
	     return "home";
   }
	@GetMapping("/offers")
	public String showOffers() {
		 return"offers";
	}
	@GetMapping("/balance")
	public String showBalance(Map<String,Object> map) {
		int amt=new Random().nextInt(100000);
		map.put("balance", amt);
		return "show_balance";
	}
	@GetMapping("/loanApprove")
	public String approvelLoan(Map<String,Object> map) {

		int amt=new Random().nextInt(100000);
		map.put("loan", amt);
		return "loan";
	}
	@GetMapping("/denied")
	public String showDeniedPage() {
		     return "denied";
	}
}
