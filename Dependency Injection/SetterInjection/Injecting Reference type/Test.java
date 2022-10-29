package com.springCoreRefrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("refConfig.xml");
        A config=(A)context.getBean("aBean");

        System.out.println(config);
    }
}
