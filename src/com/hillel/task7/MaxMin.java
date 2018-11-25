package com.hillel.task7;

public class MaxMin {
    public static double maxValue(double[] aDoubleNums) {
        double max = aDoubleNums[0];
        for (int a = 0; a < aDoubleNums.length; a++) {
            if (aDoubleNums[a] > max) {
                max = aDoubleNums[a];
            }
        }
        return max;
    }
    public static double minValue(double[] aDubleNums) {
        double min = aDubleNums[0];
        for (int a = 0; a < aDubleNums.length; a++)
            if (aDubleNums[a] < min) {
                min = aDubleNums[a];
            }
        return min;
    }
}
