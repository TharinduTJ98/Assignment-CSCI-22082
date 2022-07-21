package com.example.assignment.service.impl;

import com.example.assignment.model.Student;
import com.example.assignment.repository.StudentRepository;
import com.example.assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getStudentByCity(String city) {
        return studentRepository.findStudentsByCity(city);
    }
}
