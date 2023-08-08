package com.spring.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.student.entity.Student;
import com.spring.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student student) {
		service.addStudent(student);
		return student;
	}
	
	@GetMapping("getall")
	public List<Student> getAllStudents()
	{
		return service.getAllStudents();
		
	}
	
	@PutMapping("/updatestudent")
    public Student updateStudent(@RequestBody Student student) {
		service.updateStudent(student);
		return student;
	}
	
	@GetMapping("/getbyid/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		return service.getStudentById(id);
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public void deleteStudent(@PathVariable int id) {
		 service.deleteStudentBYId(id);
	}
	
	
}
