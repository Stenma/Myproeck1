package com.hillel.task9;

public class EvenOdd {
    public static void main(String[] args){
        char[] word = {'n','o','i','t','a','r','b','e','l','e','c'};
        for (int i = word.length-1;i > 0;i--){
            System.out.print(word[i]);
        }
    }

    public static class Swap {
        public static void main(String[ ] args) {

        double[] a = {1.1,0.5,4.3,2.1,0.06};

        int nMin = 0;
        int nMax = 0;

        double max = a[0];
        double min = a[0];

        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
                nMax = i;
            }
            if (a[i] < min) {
                min = i;
                nMin = i;
            }
        }
        double tmp = a[nMax];
        a[nMax] = a[nMin];
        a[nMin] = tmp;

        for (double item: a) {
            System.out.print(item + ",");
        }

    }

    }
}
