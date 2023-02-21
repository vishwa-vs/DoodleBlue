//package com.example.demo.config;
//
//import java.util.Optional;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import com.example.demo.entity.UserEntity;
//import com.example.demo.repository.UserRepository;
//
//
//@Component
//
//public class UserInfoUserDetailsService implements UserDetailsService {
//
//	
//	private UserRepository uRepo;
//	
//	@Override
//	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//		
//		Optional<UserEntity> userEntity= uRepo.findByuemail(email);
//		
//		return	userEntity.map(UserInfoUserDetails::new)
//		.orElseThrow(()->new UsernameNotFoundException("User Not Found"+email));
//		
//		
//	}
//
//}
