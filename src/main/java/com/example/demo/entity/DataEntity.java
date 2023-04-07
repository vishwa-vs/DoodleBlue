package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class DataEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	@Column(name="name",unique=true)
	private String name;
	@Column(name="password",unique=true)
	private String password;
	@Column(name="role")
	private String role;
	@Column(name="department")
	private String department;
	@Column(name="address")
	private String address;
	@Column(name="contactNo")
	private long contactNo;
	

	public DataEntity() {
		super();
	}


	public DataEntity(int studentId, String name, String password, String role, String department, String address,
			long contactNo) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.password = password;
		this.role = role;
		this.department = department;
		this.address = address;
		this.contactNo = contactNo;
	}
	
	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getContactNo() {
		return contactNo;
	}


	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	
}
