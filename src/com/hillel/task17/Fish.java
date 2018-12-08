package com.hillel.task17;

public class Fish extends Animal{
    public Fish(String name, int age, double weight, String color, String isPredator) {
        super(name, age, weight, color, isPredator);
    }

    @Override
    public void say() {
        System.out.println("...");
    }
}
