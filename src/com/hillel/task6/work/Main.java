package com.hillel.task6.work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите k: ");
        int k=in.nextInt();
        int n=1;
        for(int i=0;i<k;i++){
            System.out.println(n*(n+1)/2);
            n++;}
    }
}
