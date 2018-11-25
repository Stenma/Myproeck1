package com.hillel.task9;

public class Teams {
    public static void main(String[] args){
        int[] a = new int[25];
        int[] b = new int[25];
        for (int i:a) {
            i = random();
            System.out.print(i + "; ");
        }
        System.out.println();
        for (int i:b) {
            i = random();
            System.out.print(i + "; ");
        }
    }
    public static int random(){
        int a = (int) (Math.random()*40);
        while(a < 20){
            a++;
        }
        return a;
    }
}
