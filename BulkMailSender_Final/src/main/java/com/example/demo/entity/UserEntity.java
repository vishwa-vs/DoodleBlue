package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class UserEntity {

	@Id
	@GeneratedValue
	private int id;
	private String uname;
	private String uemail;
	private String upass;
	private String urole;
	
	public UserEntity() {
		
	}
	public UserEntity(int id, String uname, String uemail, String upass, String urole) {
		super();
		this.id = id;
		this.uname = uname;
		this.uemail = uemail;
		this.upass = upass;
		this.urole = urole;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUrole() {
		return urole;
	}
	public void setUrole(String urole) {
		this.urole = urole;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", uname=" + uname + ", uemail=" + uemail + ", upass=" + upass + ", urole="
				+ urole + "]";
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
