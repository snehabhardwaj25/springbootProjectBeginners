package com.sneha.springdemo.service;

import java.time.LocalDate;
import java.util.List;
import com.sneha.springdemo.model.Student;

public interface StudentService {
	
	Student SaveStudents(Student s);
	
	List<Student> findAllStudents();
	
	Student findByEmail(String email);
	
	Student update(Student s);
	
	void delete(String email);
	 
	  
	
}
