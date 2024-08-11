package com.nt.ms;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop-api")
public class FlipkartServiceController {
	@GetMapping("/welcome")
    public ResponseEntity<String>  shopService(){
    	  return new ResponseEntity<String>("Hii,Welcome  To Flikart Services",HttpStatus.OK);
    	   
    }   
}
