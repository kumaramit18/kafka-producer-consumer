package com.sampleproject.kafka.springbootkafkaproducerexample.model;

public class User {
    private String name;
    private String dept;
    private long salary;

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public User(String name, String dept, long salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}
