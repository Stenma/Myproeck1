package com.hillel.task17;

public class Lion extends Animal{
    public Lion(String name, int age, double weight, String color, String isPredator) {
        super(name, age, weight, color, isPredator);
    }

    @Override
    public void say() {
        System.out.println("and I am angry");
    }
}
