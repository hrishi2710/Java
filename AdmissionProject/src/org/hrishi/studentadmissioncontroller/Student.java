package org.hrishi.studentadmissioncontroller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Student {
	
	@Pattern(regexp="[^0-9]*")
	private String studentName;
	
	@Size(min = 2, max= 30) @IsValidHobby(listOfValidHobbies="Cricket|Football|Music")
	private String studentHobby;
	@Max(1000)
	private Long studentMobile;
	@Past
	private Date studentDob;
	private List<String> studentSkills;
	private Address studentAddress;
	
	
	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getStudentDob() {
		return studentDob;
	}

	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}

	public List<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) { 
		this.studentName = studentName;
	}
	
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	
	public String getStudentHobby() {
		return studentHobby;
	}

}
