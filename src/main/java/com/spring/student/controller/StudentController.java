package com.spring.student.controller;

import java.util.List;
import java.util.Optional;

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
	
	@GetMapping("/getbyName/{name}")
	public List<Student> getStudentById(@PathVariable("name") String studentName) {
		return service.getStudentByName(studentName);
	}
	
	@DeleteMapping("/deletestudent/{name}")
	public void deleteStudent(@PathVariable("name") String studentName) {
		 service.deleteStudentByName(studentName);
	}
	
	
}
