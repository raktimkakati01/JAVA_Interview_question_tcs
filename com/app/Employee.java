package com.app;

import java.io.StringReader;

public class Employee {
    String id;
    String name;
    String dept;
    int age;

    public Employee(String String , String name , String dept , int age){
        super();
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept(){
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age +"]";
    }

}
