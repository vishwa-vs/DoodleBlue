package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class UserEntity {

	@Id
	@GeneratedValue
	private int id;
	private String uemail;
	private String upass;
	
	public String getupass() {
		return upass;
	}
	public void setupass(String upass) {
		this.upass = upass;
	}
	
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", uemail=" + uemail + ", upass=" + upass + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	
	
}
