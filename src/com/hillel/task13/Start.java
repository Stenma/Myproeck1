package com.hillel.task13;

public class Start {
    public static void main(String[] args) {
        Author petrov = new Author("Alexsandr Petrov",1967);
        Book book1 = new Book(251,"Legengs of Alisa",petrov );
        petrov.getBirthYear(1986);
        System.out.println();

        Book book2 = new Book(154,"Margarita",new Author("Boresenko",1897));

        System.out.println();
    }
}
