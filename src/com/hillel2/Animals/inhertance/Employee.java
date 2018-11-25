package com.hillel2.Animals.inhertance;

public class Employee extends Persona {
    private int salary;
    private int bunus;

    public Employee(String n, int a, int salary) {
        super(n, a);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}

