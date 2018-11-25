package com.hillel2.RandomSelectively;

public class MultiDimArray {
    public static void main(String[] args){
        int[][] a ={
                {10,20,-15},
                {1,2,3},
                {4,5,6},
                {5,3,2}
        };
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
