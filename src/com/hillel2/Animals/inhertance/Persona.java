package com.hillel2.Animals.inhertance;

public class Persona {
    private String name;
    private int age;

    public Persona(){
        age = (int)(Math.random()*10)+18;
        name = "Ivan";
        // name = getRandomName();
    }

    public Persona(String n) {
        name = n;
    }
    public Persona(String n,int a){
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public void setName(String name) {
        this.name = name;
    }
}
