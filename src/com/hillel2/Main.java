package com.hillel2;

import com.hillel2.Animals.inhertance.Employee;
import com.hillel2.Animals.inhertance.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Andrey",11);
        Persona persona2 = new Persona("Alexey",20);

        Employee emp1 = new Employee("Nata",18,10000);
        Employee emp2 = new Employee("George",24,9000);
        Employee emp3 = new Employee("Tolik",31,7000);

        System.out.println(persona1.getName());

        String nameEmp3 = emp3.getName();
        int ageEmp3 = emp3.getAge();
        int salaryEmp3 = emp3.getSalary();

        System.out.println("name= " + nameEmp3 + " ;" + "age: " + ageEmp3 + "; " + "salary: " + salaryEmp3);

    }
}
