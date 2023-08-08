package com.spring.student.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.student.entity.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
