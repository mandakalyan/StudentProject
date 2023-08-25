package com.spring.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.student.entity.Student;
import com.spring.student.repository.StudentRepository;
import com.spring.student.service.StudentService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentProject1Tests {

	@Autowired
	private StudentService service;
	
	@MockBean
	private StudentRepository repository;
	@Test
	public void getStudents() {
		when(repository.findAll()).thenReturn(Stream.
				of(new Student("123","gohan","hyd",9890,"btech",897),new Student("123","goku","hyd",98904,"btech",897)).collect(Collectors.toList()));
		     assertEquals(2, service.getAllStudents().size());
	}
	
	@Test
	public void getStudentsByName() {
		String name="goku";
		when(repository.findByStudentName(name)).thenReturn(Stream.
				of(new Student("123","gohan","hyd",9890,"btech",897)).collect(Collectors.toList()));
		        assertEquals(1, service.getStudentByName(name).size());
	}
	
	@Test
	public void addStudent() {
		Student student =new Student("123","gohan","hyd",9890,"btech",897);
		when(repository.save(student)).thenReturn(student);
		assertEquals(student, service.addStudent(student));
	}
	
	@Test
	public void deleteStudent() {
		String studentName="goku";
		service.deleteStudentByName(studentName);
		verify(repository,times(1)).deleteByStudentName(studentName);

		
	}
	
}
