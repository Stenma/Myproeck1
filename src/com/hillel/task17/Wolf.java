package com.hillel.task17;

public class Wolf extends Animal{
    public Wolf(String name, int age, double weight, String color, String isPredator) {
        super(name, age, weight, color, isPredator);
    }

    @Override
    public void say() {
        System.out.println("I am a wild animal");
    }
}
