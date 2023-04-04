package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SecurityEntity;
import com.example.demo.service.SecurityService;
@RestController
public class SecurityController {

	
	
	@Autowired
	SecurityService service;
	
	//@GetMapping("/admin")
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	//@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String test() {
		return "Welcome ADMIN";
	}
	
	//@GetMapping("/user")
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	//@PreAuthorize("hasAuthority('ROLE_USER')")
	public String user() {
		return "Welcome USER";
	}
	@GetMapping("/all")
	public String all() {
		return "all";
	}
	
	@PostMapping("/adduser")
	public String addUser(@RequestBody SecurityEntity entity) {
		return service.addUser(entity);
	
	}
	
}
