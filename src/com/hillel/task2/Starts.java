package com.hillel.task2;

public class Starts {
    public static int sum(int a,int b,int c){
        int result = a+b*(c/2);
        return result;
    }
    public static double pow(double a,double b){
        Math.pow(2,2);
        double result = (a+b)%2;
        return result;
    }
    public static double red(double a,double b,double c, double d){
        double sum1=a+b;
        double mil=12*c;
        double sum2=4+d;
        double result = sum1/mil%sum2;
        return result;
    }
    public static int mill(int a,int b,int c){
        int sun = a-b*c;
        int dit = a+b;
        int result = sun /dit%c;
        return result;
    }
}
