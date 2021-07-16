package ru.itsjava.interfaces.comparable;

import java.util.Arrays;

public class ComparablePractice {
    public static void main(String[] args) {

//        Boy vitalik = new Boy("Vitalik", 15, 164);
//        Boy vasya = new Boy ("Vasya", 14, 160);
//        Boy vanya = new Boy("Vanya", 18, 180);
//
//        System.out.println("vitalik.compareTo(vasya) = " + vitalik.compareTo(vasya));
//        System.out.println("vasya.compareTo(vanya) = " + vasya.compareTo(vanya));
//
//        Boy [] boys = {vitalik, vasya, vanya};
//        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));
//        Arrays.sort(boys);
//        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));

        Person pasha = new Person("Pasha", "Petrov", 23);
        Person igor = new Person("Igor", "Petrov", 44);
        Person masha = new Person("Masha", "Ivanova", 23);
        Person irina = new Person("Irina", "Emelina", 36);

        System.out.println("pasha.compareTo(igor) = " + pasha.compareTo(igor));
        System.out.println("masha.compareTo(pasha) = " + masha.compareTo(pasha));
        System.out.println("irina.compareTo(masha) = " + irina.compareTo(masha));

        Person [] persons = {pasha, igor, irina, masha};
        System.out.println("Arrays.toString(persons) = " + Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println("Arrays.toString(persons) = " + Arrays.toString(persons));


    }
}
