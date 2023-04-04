package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;


@SpringBootApplication
@OpenAPIDefinition
public class SpringSecutiryProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringSecutiryProjectApplication.class, args);
	}
	
	


}
