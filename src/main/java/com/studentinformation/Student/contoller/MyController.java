package com.studentinformation.Student.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.studentinformation.Student.ESentity.Student;
import com.studentinformation.Student.Service.ESservice;
//i am adding a controller here
@RestController
public class MyController {
	//changs in controllerto test git
	@Autowired
	private ESservice eservice;
	
	@GetMapping("/getall")
	public Iterable<Student> getAllStud(){
		return this.eservice.getAllStuds();
	}
	
	@GetMapping("/students/{studentId}")
	public Iterable<Student> getStudInfo()
	{
		return this.eservice.getStudInfo();
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student )
	{
		return this.eservice.addStudent(student);
	}

}
