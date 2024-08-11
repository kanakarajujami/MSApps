package com.nt.encrypt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		
     BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
   String pw1=  encoder.encode("rani");
  String pw2=    encoder.encode("hyd");
  System.out.println(pw1);
  System.out.println(pw2);
	}

}
