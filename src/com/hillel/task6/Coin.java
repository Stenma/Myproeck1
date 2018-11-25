package com.hillel.task6;

import java.util.Random;

public class Coin {
    public static void main(String[] args){
        Random random = new Random();
        for (int i = 0; i < 1;i++){
            if (i == 1){
                System.out.println("Орёл");
            }else{
                System.out.println("Решка");
            }
            int str = random.nextInt(2000);
            System.out.println(str);
        }
    }
}
