package com.hillel.task9;

public class Odd {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7} ;
        if (a.length%2==1){
            for (int i = 0; i < a.length; i++){
                int sum = 0;
                sum = sum + a[i];
                System.out.println(sum);
            }
            }else if (a.length%1==2){
                for (int i = 0; i < a.length;i++){
                    int sum = 0;
                    sum = sum + a[i];
                    System.out.println(sum);
                }
        }
    }
}