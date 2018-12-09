package com.hillel.task1;

import com.hillel.task8.Scaner;

import com.hillel.task1.Seaseon;

public class Main {

    public static void main(String[] args) {

        Seaseon season;
        Scaner scaner = new Scaner(System.in);
        System.out.println("Please input current number of month");
        int numMonth = scaner.nextInt();
        switch (numMonth){
            case 12:
            case 1:
            case 2:
                season = Seaseon.Winter;
                break;
            case 3:
            case 4:
            case 5:
                season = Seaseon.Spring;
                break;
            case 6:
            case 7:
            case 8:
                season = Seaseon.Summer;
                break;
            case 9:
            case 10:
            case 11:
                season = Seaseon.Autunm;
                break;
                default:
                    season = Seaseon.Undefined;
        }
        if (season == Seaseon.Undefined){
            System.out.println("You are stupid, you must iput number only from 1 to 12");
        }
        System.out.println(season);

    }
}
