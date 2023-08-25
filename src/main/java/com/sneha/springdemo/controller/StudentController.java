package com.sneha.springdemo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sneha.springdemo.model.Student;
import com.sneha.springdemo.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@PostMapping
	public Student save(@RequestBody Student student) {
		return studentService.SaveStudents(student);
	}

	@GetMapping("/{email}")
	public Student findByEmail(@PathVariable("email") String email){
		return studentService.findByEmail(email);
	}
	
	
	@GetMapping
	public List<Student> findAllStudents(){
		return studentService.findAllStudents();
	}
	
	@PutMapping
	public Student updateStudent(@RequestBody Student student) {
		return studentService.update(student);
	}
	
	@DeleteMapping("/{email}")
	public void delete(@PathVariable("email")String email){
		studentService.delete(email);
	}

}
