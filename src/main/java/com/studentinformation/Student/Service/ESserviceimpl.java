package com.studentinformation.Student.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.studentinformation.Student.ESentity.Student;
import com.studentinformation.Student.ElasticRepository.ESRepo;

public class ESserviceimpl implements ESservice{
	
	@Autowired
	private ESRepo esrepo;

	@Override
	public Iterable<Student> getStudInfo() {
		// TODO Auto-generated method stub
		return esrepo.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return esrepo.save(student);
	}
	
	@Override
	public Iterable<Student> getAllStuds() {
		return esrepo.findAll();
	}
	

}
