package com.example.demo.controller;

import java.io.IOException;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.security.core.Authentication;
import com.example.demo.entity.DataEntity;
import com.example.demo.entity.StudentProfile;
import com.example.demo.model.DataModel;
import com.example.demo.repository.ProfileRepository;
import com.example.demo.service.DataService;
import com.example.demo.service.FileService;
import com.example.demo.service.ProfileService;

@RestController
public class DataController {

	@Autowired
	DataService dataService;
	
	@Autowired
	ProfileService profileService;
	
	@GetMapping("/hello")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String sayHello() {
		return "Hello...";
	}
	
	@PostMapping("/signin")
	public DataEntity signInUSer(@RequestBody DataEntity data) {
		return dataService.signInUser(data);
	}
	
	@GetMapping("/userlogin")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public Optional<DataEntity> logInUser() {
		SecurityContext securityContext = SecurityContextHolder.getContext();
		Authentication authentication = securityContext.getAuthentication();
		String username = authentication.getName();
		//System.out.println("hello  "+username);
		return dataService.logInUser(username);
	}
	
	@PostMapping("/updateProfile")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public StudentProfile updateProfile(@RequestBody StudentProfile data) {
		return profileService.updateProfile(data);
	}
	
	@Autowired
	private FileService service;

	@PostMapping("/uploadfile")
	public ResponseEntity<?> uploadImage(@RequestParam("fileData")MultipartFile file) throws IOException {
		String uploadImage = service.uploadImage(file);
		return ResponseEntity.status(HttpStatus.OK)
				.body(uploadImage);
	}

	@GetMapping("/view/{fileName}")
	public ResponseEntity<?> downloadImage(@PathVariable String fileName){
		byte[] imageData=service.downloadImage(fileName);
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.valueOf("image/png"))
				.body(imageData);
		
	}
	
	
}
