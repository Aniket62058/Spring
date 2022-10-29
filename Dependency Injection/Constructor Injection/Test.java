package com.springCoreCons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //Since we are passing xml file in class path, so we would have to use classPathXmlApplicationContext
        ApplicationContext context=new ClassPathXmlApplicationContext("consConfig.xml");

        //getBean() :- Return an instance, which may be shared or independent, of the specified bean.
        Employee emp= (Employee) context.getBean("employee");
        System.out.println(emp);
    }
}
