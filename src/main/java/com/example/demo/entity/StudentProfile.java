package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentProfile")
public class StudentProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "studentName")
	private String studentName;
	@Column(name = "studentRollNo",unique = true)
	private String studentRollNo;
	@Column(name = "studentAddress")
	private String studentAddress;
	@Column(name = "studentDepartment")
	private String studentDepartment;
	@Column(name = "studentEmail",unique = true)
	private String studentEmail;
	@Column(name = "yearOfStudy")
	private String yearOfStudy;
	@Column(name = "contactNo",unique = true)
	private String contactNo;
	@Column(name = "studentSkills")
	private String studentSkills;
	@Column(name = "areaOfInterest")
	private String areaOfInterest;
	
	public StudentProfile() {
		super();
	}

	public StudentProfile(int id, String studentName, String studentRollNo, String studentAddress,
			String studentDepartment, String studentEmail, String yearOfStudy, String contactNo, String studentSkills,
			String areaOfInterest) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.studentAddress = studentAddress;
		this.studentDepartment = studentDepartment;
		this.studentEmail = studentEmail;
		this.yearOfStudy = yearOfStudy;
		this.contactNo = contactNo;
		this.studentSkills = studentSkills;
		this.areaOfInterest = areaOfInterest;
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getStudentRollNo() {
		return studentRollNo;
	}



	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}



	public String getStudentAddress() {
		return studentAddress;
	}



	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}



	public String getStudentDepartment() {
		return studentDepartment;
	}



	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}



	public String getStudentEmail() {
		return studentEmail;
	}



	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}



	public String getYearOfStudy() {
		return yearOfStudy;
	}



	public void setYearOfStudy(String yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}



	public String getContactNo() {
		return contactNo;
	}



	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}



	public String getStudentSkills() {
		return studentSkills;
	}



	public void setStudentSkills(String studentSkills) {
		this.studentSkills = studentSkills;
	}



	public String getAreaOfInterest() {
		return areaOfInterest;
	}



	public void setAreaOfInterest(String areaOfInterest) {
		this.areaOfInterest = areaOfInterest;
	}
	
	
}
