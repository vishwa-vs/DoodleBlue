package com.example.demo.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.EmailEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.model.EmailModel;
import com.example.demo.repository.EmailRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.MailSendingService;

@Controller
public class UserController {

	//@Autowired
	//private PasswordEncoder passwordEncoder;
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserRepository uRepo;
	
	@Autowired
	private EmailRepository eRepo;
	
	@Autowired
	private MailSendingService service;

	@GetMapping("/signin")  //SignIn End Point
    public String signin() {
        return "signin";
	}
	
	@GetMapping("/") // Storing the Sign In Details And Returns the Login Page
	//@PreAuthorize("hasAuthority('ROLE_USER')")
    public String index(UserEntity uEntity) {
		//uEntity.setUpass(passwordEncoder.encode(uEntity.getUpass()));
		uRepo.save(uEntity);
		logger.info("User Data Saved");
        return "index";
	}

	@GetMapping("/getemails") // DashBoard Page(Getting Email and Mail Details)
    public String getemails() {
		logger.info("User Login Success");
        return "getemails";
	}
	
	@PostMapping("/saveemails") // Sending the Email and Saving in the Entity
  public String save(@ModelAttribute  UserEntity uEntity,EmailModel emailModel,Model model,EmailEntity eEntity) {
		eRepo.save(eEntity);
		List<EmailEntity> emailList =eRepo.findAll();
        model.addAttribute("emailList", emailList);
		String[] emails = emailModel.getuEmail().split(",");
		String emailHeader = emailModel.getuEmailHeader();
		String emailFooter = emailModel.getuEmailFooter();
		String emailSubject = emailModel.getuEmailSubject();
		String emailBody = emailModel.getuEmailBody();
			try {
				for(int i=0;i<emails.length;i++) {
					service.MailSender(emails[i],emailSubject,emailHeader+"\n\n"
												+emailBody+"\n\n"+emailFooter);
					logger.info("Mail Sent");
				}
			}
		catch(Exception e)
			{
			e.printStackTrace();
			}
        return "send";
	}
}