package com.hillel.task10;

import java.util.Arrays;


public class GetMin {

    public static void main(String[] args) {
        int[] a = {3,7,0,2,4,1};
        for (int i = 0; i < a.length; i++)
            if (0 == a[i]) {
                int min1 = a[i];
                System.out.println(min1);
            } else if (1 == a[i]) {
                int min2 = a[i];
                System.out.println(min2);
                GetMin.swap(a[0], a[2]);
                System.out.println(Arrays.toString(a));
            }
    }
    private static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
}