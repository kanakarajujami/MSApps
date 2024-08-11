package com.nt.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee-api")
@RefreshScope
public class EmployeeOperationsController {
	@Value("${dbuser}")
	private String user;
	@Value("${password}")
	private String password;
	@GetMapping("empData")
   public ResponseEntity<String> employeeInfo(){
	    return  new ResponseEntity<String>("Employee Data::"+user+"....."+password,HttpStatus.OK);
   }
}
