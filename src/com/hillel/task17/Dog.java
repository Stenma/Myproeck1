package com.hillel.task17;

public class Dog extends Animal {
    public Dog(String name, int age, double weight, String color, String isPredator) {
        super(name, age, weight, color, isPredator);
    }

    @Override
    public void say() {
        System.out.println("Woof");
    }
}
