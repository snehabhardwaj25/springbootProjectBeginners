package com.sneha.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sneha.springdemo.dao.InMemoryStudentDao;
import com.sneha.springdemo.model.Student;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private final InMemoryStudentDao dao;
	
	public StudentServiceImpl(InMemoryStudentDao dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Student> findAllStudents() {
		return dao.findAllStudents();
	}


	@Override
	public Student SaveStudents(Student s) {
		return dao.SaveStudents(s);
	}

	@Override
	public Student findByEmail(String email) {
		return dao.findByEmail(email);
	}

	@Override
	public Student update(Student s) {
		return dao.update(s);
	}

	@Override
	public void delete(String email) {
		dao.delete(email);		
	}

}
