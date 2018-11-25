package com.hillel2.RandomSelectively;

import com.hillel2.Randoms;

import java.util.Arrays;

public class Selectively {
    public static void main(String[] args) {
        final int TOTAL_NUMBER = 10;
        final int MIN_RAND = 1;
        final int MAX_RAND = 10;
        int [] digits = new int [TOTAL_NUMBER];
        int count = 0;
            do {
                int rand = Randoms.stras(MIN_RAND,MAX_RAND);
                if (isUniqRand(rand, digits)) {
                    digits[count] = rand;
                    count++;
                }
            }while (count < TOTAL_NUMBER) ;
            System.out.println(Arrays.toString(digits));
        }
    private static boolean isUniqRand(int rand, int arr[]){
        for (int digits : arr){
            if (digits == rand){
                return false;
            }
        }return true;
    }
}
