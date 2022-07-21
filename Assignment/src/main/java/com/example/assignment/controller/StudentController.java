package com.example.assignment.controller;

import com.example.assignment.model.Student;
import com.example.assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello! Tharindu jayawardhana";
    }

    @RequestMapping(value = "/student-list", method = RequestMethod.POST)
    public ResponseEntity<List<Student>> studentList(){
        return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.OK);
    }

//    @GetMapping("/student")
//    public ResponseEntity<List<Student>> studentDetails(@RequestParam String city){
//        List<Student> studentList = studentService.getStudentByCity(city);
//        return new ResponseEntity<>(studentList, HttpStatus.OK);
//    }
}
