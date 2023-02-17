package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.EmailEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.model.EmailModel;
import com.example.demo.repository.EmailRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.MailSendingService;


@Controller
public class UserController {

	@Autowired
	private UserRepository uRepo;
	
	@Autowired
	private EmailRepository eRepo;
	
	@Autowired
	private MailSendingService service;

	
	@GetMapping("/")
    public String index() {
        return "index";
	}
	@PostMapping("/show")
  public String save(@ModelAttribute UserEntity uEntity,Model model, EmailEntity emailEntity) {
		uRepo.save(uEntity);
		List<EmailEntity> emailList =eRepo.findAll();
        model.addAttribute("emailList", emailList);
        return "show";
	}
	
	@PostMapping("/send")
	  public String send(@ModelAttribute UserEntity uEntity,Model model, EmailEntity emailEntity) {
			List<EmailEntity> emailList =eRepo.findAll();
	        model.addAttribute("emailList", emailList);
			uRepo.save(uEntity);
			service.sendBulkEmail(emailEntity);
	      return "send";
		}

	@GetMapping("/addemail")
	public String addEmail(@ModelAttribute EmailEntity eEntity,EmailModel emailModel) {
		//String[] emails = emailModel.getuEmail().split(",");
		//eRepo.save(eEntity);
		return "addemail";
	}
	
	@PostMapping("/show2")
	  public String save2(@ModelAttribute EmailEntity eEntity,Model model, EmailEntity emailEntity) {
			List<EmailEntity> emailList =eRepo.findAll();
	        model.addAttribute("emailList", emailList);
			eRepo.save(eEntity);
	      return "show";
	
	}
	
}
