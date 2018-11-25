package com.hillel2;

import java.util.Arrays;

public class DynamicArray {

    private static final int INITTSL_SIZE = 10;

    private static int counter = 0;

    private static int [] arr = new  int[INITTSL_SIZE];

    public static void add(int data){
        if (counter == arr.length){
//            int[] newArr = new int[arr.length * 2];
            int[] newArr = Arrays.copyOf(arr, arr.length * 2);
            arr = newArr;
        }
        arr[counter] = data;
        counter++;
    }

    public static int ger(int ind){
        return arr[ind];
    }
    public static int getSize(){
        return arr.length;
    }
    public static void removeLast(){
        counter--;
    }
}
