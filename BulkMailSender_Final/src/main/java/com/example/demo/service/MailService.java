package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmailEntity;
import com.example.demo.repository.EmailRepository;

@Service
public class MailService {
	@Autowired
	private EmailRepository eRepo;
	
	public List<EmailEntity> findAlluEmail(){
		return eRepo.findAll();	
	}	
}
