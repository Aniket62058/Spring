package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        //Since we are passing xml file in class path, so we would have to use classPathXmlApplicationContext
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

        //getBean() :- Return an instance, which may be shared or independent, of the specified bean.
        Student student1= (Student) context.getBean("student1");
        
        
        System.out.println(student1.getStudentName());
        System.out.println(student1.getStudentId());
        System.out.println(student1.getStudentAddress());
        System.out.println(student1.getFriends());
    }
}
