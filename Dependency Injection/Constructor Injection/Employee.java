package com.springCoreCons;

import java.util.List;

public class Employee {
    private String name;
    private int id;
    private Certificate certi;
    private List colleges;

    public Employee(){

    }

    public Employee(String name, int id, Certificate certi, List colleges) {
        this.name = name;
        this.id = id;
        this.certi = certi;
        this.colleges = colleges;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\nname='" + name + '\'' +
                "\n id=" + id +
                "\n certi=" + certi +
                "\n colleges=" + colleges +
                '}';
    }
}
