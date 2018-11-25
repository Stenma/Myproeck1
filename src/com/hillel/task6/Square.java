package com.hillel.task6;

public class Square {

    public static void main(String[] agrs){
    for (int i = 1; i <= 5; i++) {
            for (int x = 1; x <= 5; x++) {
                if (i == x) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}

