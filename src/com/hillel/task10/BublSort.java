package com.hillel.task10;

import java.util.Arrays;

public class BublSort {
    public static void main(String[] agrs){
        int[] arr = {3,7,0,2,4,1};
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }

}
