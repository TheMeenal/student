package com.studentinformation.Student.Service;

import org.springframework.stereotype.Service;

import com.studentinformation.Student.ESentity.Student;

@Service
public interface ESservice {

	Iterable<Student> getStudInfo();

	Student addStudent(Student student);

	Iterable<Student> getAllStuds();

}
