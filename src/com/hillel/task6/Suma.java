package com.hillel.task6;

public class Suma {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
            System.out.println(sum);
        }
        System.out.println("Сумма = " + sum);
    }
}
