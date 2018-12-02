package com.hillel2.oop2;

public class Person {
    private static int counterInstance;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.counterInstance++;
    }

    public Person(String name) {
        this.name = name;
        this.counterInstance++;
    }

    public static int getCounterInstance() {
        return counterInstance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showPerson(){
        System.out.println(name + " : " + age);
    }
}
