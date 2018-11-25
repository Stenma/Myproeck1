package com.hillel.task1;

public class Kunkular {
    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y) {
        int result = x - y;
        return result;
    }
    public static int del(int x, int y) {
        int result = x / y;
        return result;
    }
    public static int mho(int x, int y){
        int result = x * y;
        return result;
    }
    public static int pow(int x){
        return x*x;
    }
    public static double add(double x,double y){
        double result = x * y;
        return result;
    }
    public  static int isEvenNum(int i){
        int result = i ^ 1;
        System.out.println(result);
        return result;
    }
    public static int shiftRight(int number, int x){
        // int result = number >> x;
        // return result;
        return number >> x;
    }

}
