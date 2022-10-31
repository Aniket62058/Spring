package org.springjdbc.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springjdbc.entities.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImp implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student=new Student();
        student.setId(resultSet.getInt(1));
        student.setName(resultSet.getString(2));
        student.setCity(resultSet.getString(3));
        return student;
    }
}
