package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DataEntity;
import com.example.demo.repository.DataRepository;

@Service
public class DataService {

	@Autowired
	DataRepository dataRepository;
	
	@Autowired
	private PasswordEncoder encoder;
	
	public DataEntity signInUser(DataEntity data) {
		data.setPassword(encoder.encode(data.getPassword()));
		return dataRepository.save(data);
	}
	
	public Optional<DataEntity> logInUser(String data) {
		return dataRepository.findByName(data);
	}
	
}
