package com.hillel.task16;

public class Employee {
    private String name;
    private int year;
    private double salary;
    public enum  gender{MALE,FEMALE}

    public Employee(String name, int year, double salary) {
        this.name = name;
        this.year = year;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getSalary() {
        return salary;
    }
}
