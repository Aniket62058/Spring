package org.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springjdbc.dao.StudentDao;
import org.springjdbc.dao.StudentDaoImp;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"org.springjdbc.dao"})
public class jdbcConfig {

    @Bean("ds")
    public DataSource getDataSource(){
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springJdbc");
        ds.setUsername("root");
        ds.setPassword("Root");
        return ds;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

//    @Bean("studentDaoImp")
//    public StudentDao getStudentDao(){
//        StudentDaoImp studentDao=new StudentDaoImp();
//        studentDao.setJdbcTemplate(getTemplate());
//        return studentDao;
//    }

}
