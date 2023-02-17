package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class EmailModel {

	private int id;
	private String uEmail;
	private String uEmailBody;
	private String uEmailSubject;
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
