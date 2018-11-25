package com.hillel2.Animals;

public class Animals {
    private String color;
    private boolean tupe;
    private String breed;
    private boolean hungry = false;

    public void move(){
        hungry = true;
        System.out.println("Animsl moved");
    }
    public void eat(){
        hungry = false;
        System.out.println("The animal eaten");
    }
    public boolean isHungry(){
        if (hungry == false){
            System.out.println("The animals is not hungry");
        }else {
            System.out.println("The animals is very hungry");
        }
        return hungry;
    }
    public void sleep(){
        System.out.println("The animal slept");
    }
}
