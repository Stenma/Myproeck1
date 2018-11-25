package com.hillel2;

public class Randoms {
    public static int stras(int min, int max){
        int result = (int)((Math.random()*max - min)+ min);
        return result;
    }
}
