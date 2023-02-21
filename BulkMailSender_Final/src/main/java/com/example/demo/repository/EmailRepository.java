package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.EmailEntity;
import com.example.demo.model.EmailModel;

@Repository
public interface EmailRepository extends JpaRepository<EmailEntity, Integer>{

	public void save(EmailModel emailModel);

    EmailEntity findByuEmail(String uEmail);
}
