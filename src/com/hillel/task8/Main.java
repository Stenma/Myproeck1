package com.hillel.task8;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введить число от 1 до 10");

        int a = Scaner.getNumbr();

        int b = Wile.random();

        while (true){

        if (a == b){
            System.out.println("Поздравляю вы угадали !!!");
            break;
        }else if (a > b ){
            System.out.println("Введите число по меньше");
            a = Scaner.getNumbr();
        }else{
            System.out.println("Введите число по больше");
            a = Scaner.getNumbr();
            }
        }
    }
}
