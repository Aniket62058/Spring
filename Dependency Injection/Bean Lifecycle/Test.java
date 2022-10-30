package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //using AbstractApplicationContext, since registerShutdownHook() is not present in ApplicationContext
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifeConfig.xml");

        Samosa s= (Samosa) context.getBean("samosa");
        System.out.println(s);
        
        //used to call destroy method
        context.registerShutdownHook();

        Pepsi p= (Pepsi) context.getBean("pepsi");
        System.out.println(p);

        Rassogulla rs= (Rassogulla) context.getBean("rassogulla");
        System.out.println(rs);
    }


}
