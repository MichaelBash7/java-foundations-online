package ru.itsjava.collections.lists.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
//        Man andrey = new Man("Andrey");
//        Man maxim = new Man("Maxim");
//        Man vitya = new Man("Vitya");
//
//        Set<Man> manSet = new HashSet<>(Arrays.asList(andrey, maxim, vitya));
//        System.out.println("manSet = " + manSet);
//
//        System.out.println(manSet.add(andrey));
//        System.out.println("manSet = " + manSet);
//
//        Man andrey2 = new Man("Andrey");
//        System.out.println("manSet.add(andrey2) = " + manSet.add(andrey2));
//        System.out.println("manSet.contains(andrey) = " + manSet.contains(andrey));
//
//        System.out.println("manSet.isEmpty() = " + manSet.isEmpty());
//        System.out.println("manSet.remove(andrey2) = " + manSet.remove(andrey2));
//        System.out.println("manSet = " + manSet);
//
//        System.out.println("manSet.remove(andrey2) = " + manSet.remove(andrey2));
//        System.out.println("manSet = " + manSet);
//
//        System.out.println("manSet.size() = " + manSet.size());

        Fruit strawberry = new Fruit("Strawberry", 12.3);
        Fruit apple = new Fruit("Apple", 37.9);
        Fruit peach = new Fruit("Peach", 25.5);

        Set<Fruit> setFruit = new HashSet<>(Arrays.asList(strawberry, apple, peach));
        System.out.println("setFruit = " + setFruit);

        Fruit grape = new Fruit("Grape", 3.6);
        setFruit.add(grape);
        System.out.println("setFruit = " + setFruit);

        Fruit apple2 = new Fruit("Apple", 37.9);

        System.out.println("setFruit.add(apple2) = " + setFruit.add(apple2));
        System.out.println("setFruit.contains(apple2) = " + setFruit.contains(apple2));

        System.out.println("setFruit.remove(apple2) = " + setFruit.remove(apple2));
        System.out.println("setFruit = " + setFruit);

        System.out.println("setFruit.remove(apple2) = " + setFruit.remove(apple2));
        System.out.println("setFruit = " + setFruit);

        System.out.println("setFruit.contains(apple2) = " + setFruit.contains(apple2));


    }
}
