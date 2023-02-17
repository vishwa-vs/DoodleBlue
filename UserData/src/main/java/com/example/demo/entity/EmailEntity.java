package com.example.demo.entity;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class EmailEntity {

	@Id
	@GeneratedValue
	private int id;
	private String uEmail;
	private String uEmailBody;
	private String uEmailSubject;
	
	
	
	@Override
	public String toString() {
		return "EmailEntity [id=" + id + ", uEmail=" + uEmail + ", uEmailBody=" + uEmailBody + ", uEmailSubject="
				+ uEmailSubject + "]";
	}

	public EmailEntity() {
		
	}
	
	public EmailEntity(int id, String uEmail, String uEmailBody, String uEmailSubject) {
		super();
		this.id = id;
		this.uEmail = uEmail;
		this.uEmailBody = uEmailBody;
		this.uEmailSubject = uEmailSubject;
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
		this.uEmail =uEmail;
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
