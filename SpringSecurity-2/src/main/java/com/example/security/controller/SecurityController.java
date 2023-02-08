package com.example.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.entity.UserInfo;
import com.example.security.repository.UserInfoRepository;
import com.example.security.service.UserService;

@RestController
@EnableMethodSecurity
public class SecurityController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/newuser") 
	public String addNewUser(@RequestBody UserInfo userInfo)
	{
		return userService.addUser(userInfo);
	}
	
	@GetMapping("/admin")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String Admin_Login()
	{
		return "Admin_Login";
	}
	@GetMapping("/user")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String User_Login()
	{
		return "User_Login";
	}
  
}
