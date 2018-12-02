package com.hillel2.oop2;

public class Main {
    public static void main(String[] args) {
        SomeClass someClass2 = new SomeClass();
        someClass2.settingNewVal();

        SomeClass someClass1 = new SomeClass();
        someClass1.data = 10;

        System.out.println(someClass2.data);
    }
}
