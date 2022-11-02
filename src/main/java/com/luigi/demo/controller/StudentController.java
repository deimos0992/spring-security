package com.luigi.demo.controller;

import com.luigi.demo.dto.Student;
import com.luigi.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable Integer studentId){

        return studentService.getNewStudent();
    }
}
