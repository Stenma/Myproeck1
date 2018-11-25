package com.hillel2.Animals;

import com.hillel2.Animals.inhertance.Persona;

public class Start {
    public static void main(String[] args) {
        Persona julia = new Persona("Julia");
        Persona yuriy = new Persona("Yuriy", 37);
        Persona p1 = new Persona();

//        String namej = julia.getName();
//        int yuriyAge = yuriy.getAge();
//
//        System.out.println(namej);
//        System.out.println(yuriyAge);

        showPerson(julia);

        julia.setAge(18);
        julia.setName("Jack");

        showPerson(julia);
    }
    private static void showPerson(Persona persona){
        System.out.println(persona.getName() + "; " + persona.getAge());
    }
}
