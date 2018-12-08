package com.hillel.task17;

public abstract class  Animal {


    private String name;
    private int age;
    private double weight;
    private  String color;
    private String isPredator;

    public abstract void say();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getIsPredator() {
        return isPredator;
    }

    public Animal(String name, int age, double weight, String color, String isPredator) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isPredator = isPredator;
    }
}
