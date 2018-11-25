package com.hillel.task8;

import java.io.InputStream;
import java.util.Scanner;

public class Scaner {
    public Scaner(InputStream in) {
    }

    public static int getNumbr(){
        System.out.println ("Введіть 2 будь-яких цілих числа: ");

        return 0;
    }

    public int nextInt() {

        Scanner k = new Scanner(System.in);
        int number1 = k.nextInt();
        int number2 = k.nextInt();
        System.out.print(number1 + number2);
        return  number1;

    }
}
