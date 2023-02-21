package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.EmailEntity;
import com.example.demo.repository.EmailRepository;


@Service
public class EmailService {

	@Autowired
	EmailRepository eRepo;
	
	public String findByUserName(String email) {
		EmailEntity eEntity = eRepo.findByuEmail(email);
				if(eEntity!=null) {
					return eEntity.getuName();
				}
				else {
					return null;
				}
	} 
}
