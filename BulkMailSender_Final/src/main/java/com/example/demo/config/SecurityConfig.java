//package com.example.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
//public class SecurityConfig {
//	private Object retrun;
//
//
//	@Bean
//	public UserDetailsService userDetailsService()
//	{
//	//	UserDetails admin = User.withUsername("Vishwa").password(encoder.encode("pass1")).roles("ADMIN").build();
//	//			UserDetails user = User.withUsername("Aman").password(encoder.encode("pass2")).roles("USER").build();
//	//			return new InMemoryUserDetailsManager(admin,user);
//	return new UserInfoUserDetailsService();
//	}
//	
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
//		return http.csrf().disable()
//				.authorizeHttpRequests().requestMatchers("/signin").permitAll()
//				.and()
//				.authorizeHttpRequests().requestMatchers("/login")
//				.authenticated().and().formLogin()
//				.and().build();
//	}
//	@Bean
//	public PasswordEncoder passwordEncoder()
//	{
//		return new BCryptPasswordEncoder();
//	}
//	
//	
//	public AuthenticationProvider authenticationProvider() {
//		
//		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//		authenticationProvider.setUserDetailsService(userDetailsService());
//		authenticationProvider.setPasswordEncoder(passwordEncoder());
//		return authenticationProvider;
//		
//	}
//	
//	
//	
//}
