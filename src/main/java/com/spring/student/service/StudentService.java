package com.spring.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.student.entity.Student;
import com.spring.student.repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	StudentRepository studentRepo;
	
	
	public void addStudent(Student student) {
	   studentRepo.save(student);	
	}
	
	public List<Student> getAllStudents(){
		List<Student> students =new ArrayList<Student>();
		studentRepo.findAll().forEach(student1->students.add(student1));
		System.out.println("all students :"+students);
		return students;
		
	}
	
	public void updateStudent(Student student) {
		studentRepo.save(student);
	}
	
	public void deleteStudentByName(String name) {
		studentRepo.deleteByStudentName(name);
	}
   
	public List<Student> getStudentByName(String name) {
		return studentRepo.findByStudentName(name);
		
	}
	
	
}
