package com.spring.student.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.student.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

	List<Student> findByStudentName(String name);

	void deleteByStudentName(String id);


}
