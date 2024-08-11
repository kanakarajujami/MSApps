package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		//build authentication info provider
        auth.inMemoryAuthentication().withUser("raju").password("{noop}rani").roles("customer");
        auth.inMemoryAuthentication().withUser("mahesh").password("{noop}hyd").roles("manager");
        auth.inMemoryAuthentication().withUser("rajesh").password("{noop}pune").roles("visitor");
	}
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll()
		.antMatchers("/offers").authenticated()
		.antMatchers("/balance").hasAnyRole("customer","manager")
		.antMatchers("/loanApprove").hasRole("manager")
		.anyRequest().authenticated()
	//	.and().httpBasic()//basic browser generated dialog box taken username and password
		.and().formLogin()
		.and().logout()
		
		.and().exceptionHandling().accessDeniedPage("/denied")
		.and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
	}
 
}
