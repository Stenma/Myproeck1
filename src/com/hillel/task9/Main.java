package com.hillel.task9;

public class Main {

    public static void main(String[] args) {
        char[] chArr = {'r','o','l','o','c'};
        char tmp = chArr[0];
        chArr[0] = chArr[4];
        chArr[4] = tmp;
        System.out.println(chArr);

    }
}

