package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo.entity.DataEntity;
import com.example.demo.model.DataModel;
import com.example.demo.repository.DataRepository;

public class UserInfoUserDetailsService implements UserDetailsService {

	@Autowired
	private DataRepository dataRespository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<DataEntity> userInfo = dataRespository.findByName(username);
		
		return userInfo.map(DataModel::new).orElseThrow(
				()->new UsernameNotFoundException("username not found"+username));
		
		
	}

}
