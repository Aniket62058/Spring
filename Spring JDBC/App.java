package org.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springjdbc.dao.StudentDao;
import org.springjdbc.dao.StudentDaoImp;
import org.springjdbc.entities.Student;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args )
    {
        System.out.println( "Program started ......." );

        //ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(jdbcConfig.class);

                    //Simple way of firing query
        /*JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
        String query="insert into student(id,name,city) values(?,?,?)";
        int result=template.update(query,989,"name","city");*/

                    //Firing query by Dao that seperate code

        StudentDao studentDao=context.getBean("studentDaoImp", StudentDao.class);
        //Student student=new Student(444,"Mohan","Balia");

        Student student=new Student(444,"Mohan Kumar","Baliya");
        //INSERT operation
        //int result=studentDao.insert(student);
        //UPDATE operation
        //int result=studentDao.change(student);
        //DELETE operation
        //int result=studentDao.delete(444);
        //SELECT operation
//        Student result=studentDao.getStudent(222);
//        System.out.println(result);

        //System.out.println("number of rows affected : "+result);

        //SELECT ALL operation
        List<Student> studentList=studentDao.getAllStudents();
        for (Student s:studentList) {
            System.out.println(s);
        }
    }
}
