package com.hillel2;

public class Starter {
    public static void main(String[] args) {
        fillDynamic();
        showDynamicArr();
    }
        private static void showDynamicArr(){
        for (int i = 0; i < DynamicArray.getSize(); i++)
            System.out.print(DynamicArray.ger(i) + "; ");
        }
        private static void fillDynamic(){
        for (int i = 0; i < 11; i++){
            DynamicArray.add(i);
        }
    }
}
