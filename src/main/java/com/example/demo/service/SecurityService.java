package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SecurityEntity;
import com.example.demo.repository.SecurityRespository;

@Service
public class SecurityService {

	@Autowired
	SecurityRespository repository;
	
	@Autowired
	private PasswordEncoder encoder;

	
	public String addUser(SecurityEntity entity) {
		
		entity.setPassword(encoder.encode(entity.getPassword()));
		
		repository.save(entity);
		return "User Added";
	}
}
