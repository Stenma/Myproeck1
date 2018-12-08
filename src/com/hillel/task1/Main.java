package com.hillel.task1;

import com.hillel.task8.Scaner;
import com.hillel2.animals.Animal;
import com.hillel2.animals.ColorAnimal;
import com.hillel2.animals.Season;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setColor(ColorAnimal.green);
        dog.sayMyColor();
        dog.setColor(ColorAnimal.black);
        dog.sayMyColor();
        Season season;
        Scaner scaner = new Scaner(System.in);
        System.out.println("Please input current number of month");
        int numMonth = scaner.nextInt();
        switch (numMonth){
            case 12:
            case 1:
            case 2:
                season = Season.Winter;
                break;
            case 3:
            case 4:
            case 5:
                season = Season.Spring;
                break;
            case 6:
            case 7:
            case 8:
                season = Season.Summer;
                break;
            case 9:
            case 10:
            case 11:
                season = Season.Autunm;
                break;
                default:
                    season = Season.Undefined;
        }
        if (season == Season.Undefined){
            System.out.println("You are stupid, you must iput number only from 1 to 12");
        }
        System.out.println(season);

    }
}
