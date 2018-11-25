package com.hillel2.Animals;

public class Animal {
    private ColorAnimal color;

    public void sayMyColor(){
        System.out.println("My color is :" + color);
    }

    public void setColor(ColorAnimal c){
        color = c;
    }
}
