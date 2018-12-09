package com.hillel;

public class Ramdoms {
        public static int stras(int min, int max){
            int result = (int)((Math.random()*max - min)+ min);
            return result;
    }
}
