package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Component
public class EmailModel {

	@Id
	@GeneratedValue
	private int id;
	private String uEmail;
	private String uEmailBody;
	private String uEmailSubject;
	private String uEmailHeader;
	private String uEmailFooter;
	
	public String getuEmailHeader() {
		return uEmailHeader;
	}
	public void setuEmailHeader(String uEmailHeader) {
		this.uEmailHeader = uEmailHeader;
	}
	public String getuEmailFooter() {
		return uEmailFooter;
	}
	public void setuEmailFooter(String uEmailFooter) {
		this.uEmailFooter = uEmailFooter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuEmailBody() {
		return uEmailBody;
	}
	public void setuEmailBody(String uEmailBody) {
		this.uEmailBody = uEmailBody;
	}
	public String getuEmailSubject() {
		return uEmailSubject;
	}
	public void setuEmailSubject(String uEmailSubject) {
		this.uEmailSubject = uEmailSubject;
	}
}
