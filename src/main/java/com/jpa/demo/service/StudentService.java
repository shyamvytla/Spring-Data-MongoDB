package com.jpa.demo.service;

import com.jpa.demo.bean.Student;
import com.jpa.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student get(int id) {
        return studentRepository.findById(id).get();
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

}
