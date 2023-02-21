package com.example.demo.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	Optional<UserEntity> findByuemail(String email);

}
