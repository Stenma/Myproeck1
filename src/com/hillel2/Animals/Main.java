package com.hillel2.Animals;

public class Main {
    public static void main(String[]args){
        Animals wolf = new Animals();
        System.out.println("Wolf:");
        wolf.sleep();
        wolf.eat();
        wolf.move();
        wolf.isHungry();
        System.out.println("Fox:");
        Animals fox = new Animals();
        fox.sleep();
        fox.move();
        fox.eat();
        fox.isHungry();
    }
}
