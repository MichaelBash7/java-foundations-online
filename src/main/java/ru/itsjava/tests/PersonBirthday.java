package ru.itsjava.tests;

public class PersonBirthday {
    public static void main(String[] args) {

        Person mikhail = new Person("Mikhail", 26);
        System.out.println("mikhail = " + mikhail);
        mikhail.birthday();
        System.out.println("mikhail.takeBeer() = " + mikhail.takeBeer());

    }
}
