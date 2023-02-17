package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmailEntity;

@Repository
public interface EmailRepository extends JpaRepository<EmailEntity, Integer>{


	

	public String findByuEmail(String uEmail );
	
	public String findByuEmailBody(String uEmailBody);
	
	public String findByuEmailSubject(String uEmailSubject);
	
	//@Query(value="SELECT u_email FROM userdata u",nativeQuery=true)
	//public List<EmailEntity> findAlluEmail();

	
}
