package org.hrishi.studentadmissioncontroller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfoRESTAPIController {
	@RequestMapping(value = "/students", method= RequestMethod.GET)
	public ArrayList<Student> getStudentsList(){
		
		Student student1 = new Student();
		student1.setStudentName("Hrishi");
		Student student2 = new Student();
		student2.setStudentName("Charlie");
		Student student3 = new Student();
		student3.setStudentName("Abhilash");
		Student student4 = new Student();
		student4.setStudentName("Manu");
		
		ArrayList<Student> studentsList = new ArrayList<Student>();
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		studentsList.add(student4);
		
		return studentsList;	
	}
	
	@RequestMapping(value="/students/{name}", method=RequestMethod.GET)
	public Student getStudent(@PathVariable("name") String studentName) {
		
		Student student = new Student();
		student.setStudentName(studentName);
		student.setStudentHobby("Music");
		
		return student;
	}
}
