package com.hillel.task8;

public class Wile {
    public static int random(){
        int a = (int) (Math.random()*10);
        while(a > 10) {
            System.out.println(a);
        a++;
        }
        return a;
    }
}

