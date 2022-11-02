package com.luigi.demo.service;

import com.luigi.demo.dto.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student getNewStudent(){
        Student s = new Student(1, "luigi");
        return s;
    }
}
