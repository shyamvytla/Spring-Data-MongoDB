package com.jpa.demo.repository;

import com.jpa.demo.bean.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {
}
