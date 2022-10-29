package com.springCore;

import java.util.List;

public class Student {
    private String studentName;
    private String studentId;
    private String studentAddress;
    private List friends;
  
    //default constructor
    public Student(){

    }
  
    //parameterized constructor
    public Student(String studentName, String studentId, String studentAddress, List friends) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentAddress = studentAddress;
        this.friends = friends;
    }
  
    //line 24 to 55 getters and setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public List getFriends() {
        return friends;
    }

    public void setFriends(List friends) {
        this.friends = friends;
    }

    
    // overiding toString() method. Because if i will print object directly then rather than printing refrence it will print fields of object. 
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", friends=" + friends +
                '}';
    }
}
