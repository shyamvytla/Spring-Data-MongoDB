package com.jpa.demo.controller;

import com.jpa.demo.bean.Student;
import com.jpa.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students/{id}")
    public Student get(@PathVariable("id") int id) {
        return studentService.get(id);
    }

    @PostMapping("/students")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

}
