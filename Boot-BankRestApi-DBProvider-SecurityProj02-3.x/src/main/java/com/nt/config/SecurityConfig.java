package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
	@Autowired
	private DataSource ds;
	@Bean
	public SecurityFilterChain defaultFilterChain(HttpSecurity http) throws Exception{
		      http.authorizeHttpRequests((requests)->requests
		    		  .requestMatchers("/bank/welcome").permitAll()
		    		  .requestMatchers("/bank/offers","/bank/balance","/bank/loan").authenticated())
		    		.formLogin(Customizer.withDefaults());
		    		 return http.build();
	}
      	    	       
	    			  
	    	             
	    
	 @Bean	                            
	  public  PasswordEncoder encode() {
		       return new BCryptPasswordEncoder();
		                              
   }
}
