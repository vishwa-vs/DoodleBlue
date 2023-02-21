package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class SubjectEntity {

	@Id
	private int id;
	private String eMailBody;
	private String eMailSubject;
	private String eMailHeader;
	private String eMailSign;
	
	
	public SubjectEntity() {
		
	}
	
	public SubjectEntity(int id, String eMailBody, String eMailSubject, String eMailHeader, String eMailSign) {
		super();
		this.id = id;
		this.eMailBody = eMailBody;
		this.eMailSubject = eMailSubject;
		this.eMailHeader = eMailHeader;
		this.eMailSign = eMailSign;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteMailBody() {
		return eMailBody;
	}
	public void seteMailBody(String eMailBody) {
		this.eMailBody = eMailBody;
	}
	public String geteMailSubject() {
		return eMailSubject;
	}
	public void seteMailSubject(String eMailSubject) {
		this.eMailSubject = eMailSubject;
	}
	public String geteMailHeader() {
		return eMailHeader;
	}
	public void seteMailHeader(String eMailHeader) {
		this.eMailHeader = eMailHeader;
	}
	public String geteMailSign() {
		return eMailSign;
	}
	public void seteMailSign(String eMailSign) {
		this.eMailSign = eMailSign;
	}
}
