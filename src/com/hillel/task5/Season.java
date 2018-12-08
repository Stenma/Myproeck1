package com.hillel.task5;

import com.hillel2.cycles.Randoms;

public class Season {

    public static void main(String[] args) {
    Randoms randoms = new Randoms();
    for (int i = 1; i < 2; i++){
        int str = randoms.hashCode ();
        switch(str) {

            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль" + 2018);
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Ноябрь");
                break;
            case 11:
                System.out.println("Октябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Незнаю такого!!!");
        }
            }
            int month = 3;
            if (month == 1){
                System.out.println("January");
            }else if (month == 2){
                System.out.println("February");
            }else if (month == 3){
                System.out.println("March");
            }else if(month == 4) {
                System.out.println("April");
            }else if (month == 5) {
                System.out.println("May");
            }else if (month == 6) {
                System.out.println("June");
            }else if (month == 7) {
                System.out.println("July");
            }else if (month == 8) {
                System.out.println("August");
            }else if (month == 9) {
                System.out.println("September");
            }else if (month == 10) {
                System.out.println("November");
            }else if (month == 11) {
                System.out.println("October");
            }else if (month == 12){
                System.out.println("December");
            }else{
                System.out.println("Not is now");
            }
    }
}
