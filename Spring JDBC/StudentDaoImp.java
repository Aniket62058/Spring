package org.springjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springjdbc.entities.Student;

import java.util.List;

@Component
public class StudentDaoImp implements StudentDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        //insert Query
        String query="insert into student(id,name,city) values(?,?,?)";
        //firing query
        int result=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return result;
    }

    @Override
    public int change(Student student) {
        //update query
        String query="update student set name=?, city=? where id=?";
        //firing query
        int result=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return result;
    }

    @Override
    public int delete(int studentId) {
        //delete query
        String query="delete from student where id=?";
        //firing query
        int result=this.jdbcTemplate.update(query,studentId);
        return result;
    }

    @Override
    public Student getStudent(int studentId) {
        //select query
        String query="select * from student where id=?";
        //firing query
        RowMapper rowMapper=new RowMapperImp();
        Student student= (Student) this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        //select all query
        String query="select * from student";
        //firing query
        List<Student> studentList=this.jdbcTemplate.query(query,new RowMapperImp());
        return studentList;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
