package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.service.UserInfoUserDetailsService;

@Configuration
@EnableWebSecurity 
@EnableMethodSecurity
public class SecurityConfig{

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder) {
		
		/*
		 * UserDetails admin = User.withUsername("vishwa") .password(
		 * encoder.encode("pass1")) .roles("ADMIN") .build();
		 * 
		 * UserDetails user = User.withUsername("aman") .password(
		 * encoder.encode("pass2")) .roles("USER") .build();
		 
		return new InMemoryUserDetailsManager(admin,user);
		*/
		
		return new UserInfoUserDetailsService();
	}
	
//	@Bean
	//public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	//	return http.csrf().disable()
	//	.authorizeHttpRequests()
	//	.requestMatchers("/all","/adduser").permitAll().and()
	//	.authorizeHttpRequests()
	//	.requestMatchers("/admin","/user","/swagger-ui.html").authenticated().and()
	//	.formLogin().and().build();                  
	//}
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    return http.csrf().disable()
	        .authorizeHttpRequests()
	            .requestMatchers("/all", "/adduser","/v3/api-docs/**", "/swagger-ui/**","/swagger-ui.html","/v3/api-docs/**")
	                .permitAll()
	            .and()
	        .authorizeHttpRequests()
	            .requestMatchers("/admin", "/user")
	                .authenticated()
	            .and()
	        .formLogin()
	            .and()
	        .build();
			}




	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
