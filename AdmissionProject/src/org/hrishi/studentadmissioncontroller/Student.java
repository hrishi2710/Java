package org.hrishi.studentadmissioncontroller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private String studentName;
	private String studentHobby;
	private Long studentMobile;
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
