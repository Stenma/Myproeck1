package com.hillel2.oop2;

public class Starter {
    public static void main(String[] args){
        Person person = new Person("Sergey",45);
        person.showPerson();

        Person person1 = new Person("Alan");
        person1.setAge(20);
        person1.showPerson();

        Person [] people = new Person[20];

        for (int i = 0; i < 20; i++){
            people[i] = new Person("Yuriy",i);

        }
        showPersons(people);

        System.out.println("General number :" + Person.getCounterInstance());
    }

    public static void showPersons(Person[] arrPersons){
        for (Person p: arrPersons) {
            p.showPerson();
        }
    }
}
