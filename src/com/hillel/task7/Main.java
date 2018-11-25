package com.hillel.task7;

public class Main {

    public static void main(String[] args){
        int [] alntNums = {-10,20,34,-11,100,20};

        int min1 = Main.minValue(alntNums);
        int max1 = Main.maxValue(alntNums);
        System.out.println("Min = " + min1);
        System.out.println("Max = " + max1);

        double[] aDubleNums = {10.10,43.543,0.01,1.3,0.1,43.4,0.001};
       double min2 = MaxMin.minValue(aDubleNums);
       double max2 = MaxMin.maxValue(aDubleNums);
       System.out.println("Min = " + min2);
        System.out.println("Max = " + max2);
    }
    public static int maxValue(int[] alntNums) {
        int max = alntNums[0];
        for (int i = 0; i < alntNums.length; i++) {
            if (alntNums[i] > max) {
                max = alntNums[i];
            }
        }
        return max;
    }
    public static int minValue(int[] alntNums) {
        int min = alntNums[0];
        for (int i = 0; i < alntNums.length; i++) {
            if (alntNums[i] < min) {
                min = alntNums[i];
            }
        }
        return min;
    }
}


