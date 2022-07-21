package com.example.assignment.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Pattern(regexp = "[a-zA-Z][a-zA-Z]/\\d\\d\\d\\d/\\d\\d\\d", message = "Invalid Student Number")
    private String StudentId;

    @NotBlank(message = "FirstName should be not blank")
    @Size(min=5, message = "FirstName should be at least 3 chars")
    private String firstName;

    @NotBlank(message = "lastName should be not blank")
    @Size(min=5, message = "lastName should be at least 3 chars")
    private String lastName;

    @NotNull
    @Size(min = 18, max = 24)
    private String Age;

    @NotNull
    private String Address;

    @NotNull
    private String city;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min=10, message = "Mobile number has 10 digits")
    private int phoneNum;

    public Student(){

    }

    public Student(String studentId, String firstName, String lastName, String age, String address, String city, String email, int phoneNum) {
        StudentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        Address = address;
        this.city = city;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
}
