package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.SecurityEntity;

public interface SecurityRespository extends JpaRepository<SecurityEntity, Integer> {

	Optional<SecurityEntity> findByUserName(String username);

}
