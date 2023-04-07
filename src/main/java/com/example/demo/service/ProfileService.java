package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DataEntity;
import com.example.demo.entity.StudentProfile;
import com.example.demo.repository.DataRepository;
import com.example.demo.repository.ProfileRepository;

@Service
public class ProfileService {
	
	@Autowired
	ProfileRepository profileRepository;
	

	public StudentProfile updateProfile(StudentProfile data) {
		return profileRepository.save(data);
	}
	
}
