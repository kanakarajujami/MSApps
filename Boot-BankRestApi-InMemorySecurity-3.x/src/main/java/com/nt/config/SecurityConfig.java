package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.memory.UserAttribute;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import ch.qos.logback.core.encoder.Encoder;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
	@Bean
	public SecurityFilterChain defaultFilterChain(HttpSecurity http) throws Exception{
		      http.authorizeHttpRequests((requests)->requests
		    		  .requestMatchers("/bank/welcome").permitAll()
		    		  .requestMatchers("/bank/offers","/bank/balance","/bank/loan").authenticated())
		    		.formLogin(Customizer.withDefaults());
		    		 return http.build();
	}
	@Bean
   public InMemoryUserDetailsManager userDetailsService() {
	    UserDetails user1=User.withUsername("raja")
	    		                            .password(encode().encode("rani"))
	    		                            .authorities("customer")
	    		                            .build();
	        UserDetails user2=User.withUsername("mahesh")
	        		                            .password(encode().encode("hyd"))
	        		                            .authorities("customer","manager")
	        		                            .build();
	         return new InMemoryUserDetailsManager(user1,user2);
	    }
	 @Bean	                            
	  public  PasswordEncoder encode() {
		       return new BCryptPasswordEncoder();
		                              
   }
}
