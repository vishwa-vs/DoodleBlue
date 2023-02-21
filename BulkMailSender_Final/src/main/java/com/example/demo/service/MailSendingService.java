package com.example.demo.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.example.demo.entity.EmailEntity;
import com.example.demo.entity.SubjectEntity;
import com.example.demo.model.EmailModel;
import com.example.demo.repository.EmailRepository;
import com.example.demo.repository.SubjectRepository;

@Service
public class MailSendingService {

	Logger logger = LoggerFactory.getLogger(MailSendingService.class);
	
	@Autowired
	private JavaMailSender sender;

	@Autowired
	private EmailRepository eRepo;
	
	@Autowired
	private SubjectRepository sRepo;
	
	@Autowired
	UserService sService;
	
	@Autowired
	EmailService eService;
	
	@Autowired
	EmailModel emailModel;
			
	public String sendBulkEmail(EmailEntity emailEntity) {
		String status ="" ;
		String[] emails = null;
		String[] emailBody= null;
		String[] emailSubject= null;
		
		List<EmailEntity> emailList =eRepo.findAll();
		List<SubjectEntity> subjectList =sRepo.findAll();
		
		try {  
			
			//setting the emails
			for(EmailEntity data :emailList) {
				 emails= data.getuEmail().split(",");
				 
			//Setting the email body and subject
			for(SubjectEntity subject :subjectList) {
				emailBody = subject.geteMailBody().split(",");
				emailSubject = subject.geteMailSubject().split(",");
				
				//Calling the MailSender method to trigger
				for(int i=0;i<emails.length;i++) {
					System.out.println(emails[i]);
					MailSender(emails[i],emailSubject[i],emailBody[i]);
				}
			} 		
		}
			status="Succes";
	}
		catch(Exception e){		
			e.printStackTrace();
		 }
		return status;
	}
	
public void MailSender(String email, String subject, String body) {
		
		SimpleMailMessage mail = new SimpleMailMessage();
		try {
		mail.setFrom("vishwavishhh@gmail.com");
		mail.setTo(email);
		mail.setText(body);
		mail.setSubject(subject);
		sender.send(mail);
		logger.info("Mail Send....");
		}
		catch(Exception e){
			logger.info("Error Ocuured While Sending Mail"+e);
		}
	}
}
