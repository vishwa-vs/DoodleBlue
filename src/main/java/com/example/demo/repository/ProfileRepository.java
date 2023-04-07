package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.DataEntity;
import com.example.demo.entity.StudentProfile;

@Repository
public interface ProfileRepository extends JpaRepository<StudentProfile, Integer>{



	
}
