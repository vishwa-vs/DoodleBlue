package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo.entity.SecurityEntity;
import com.example.demo.model.UserInfoUserDetails;
import com.example.demo.repository.SecurityRespository;

public class UserInfoUserDetailsService implements UserDetailsService {

	@Autowired
	private SecurityRespository securityRespository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<SecurityEntity> userInfo = securityRespository.findByUserName(username);
		
		return userInfo.map(UserInfoUserDetails::new).orElseThrow(
				()->new UsernameNotFoundException("username not found"+username));
		
		
	}
	

}
