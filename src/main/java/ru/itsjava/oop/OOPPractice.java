package ru.itsjava.oop;

import java.util.ArrayList;
import java.util.List;

public class OOPPractice {
    public static void main(String[] args) {

//        Telephone phone = new IPhone();
//        System.out.println("phone.toString() = " + phone.toString());
//        Telephone phone2 = new IPhone();
//        System.out.println("phone2.toString() = " + phone2.toString());

//        Birds bird = new Parrot("Попугай", 10);
//        System.out.println("bird.toBirdsString() = " + bird.toString());
//        Birds bird2 = new Crow("Ворона", 15);
//        System.out.println("bird2.toBirdsString() = " + bird2.toString());
//        System.out.println("bird.equals(bird2) = " + bird.equals(bird2));
//
//
//        Melon melon = new Melon("Дыня",140);
//        System.out.println("melon.toString() = " + melon.toString());
//
//        Lime lime = new Lime("Лайм",150);
//        System.out.println("lime.toStringFruits() = " + lime);
//
//        Fruits pears = new Fruits("Груши", false, false, 34);
//        System.out.println("pears.toString() = " + pears.toString());



//        Parrot parrot = new Parrot("Попугай", 23);
//        System.out.println("parrot.recognizeBird() = " + parrot.recognizeBird());
//
//        Crow crow = new Crow("Ворона", 10);
//        System.out.println("crow.recognizeBird() = " + crow.recognizeBird());

//        Fruits pear1 = new Fruits("pear", false, false, 45);
//        Fruits pear2 = new Fruits("pear", false, false, 45);
//
//        System.out.println("pear1.equals(pear2) = " + pear1.equals(pear2));
//
//        Airplane airbus = new Airplane();
//        System.out.println(airbus);

        List <Fruits> fruitsList = new ArrayList<>();
        Fruits pear = new Fruits("pear", false, false, 45);
        Fruits apple = new Fruits("apple", false, true, 58);
        Fruits lemon = new Fruits("lemon", true, true, 36);

        fruitsList.add(pear);
        fruitsList.add(apple);
        fruitsList.add(lemon);

        System.out.println("List of fruits:");

        for (Fruits elemFruits:fruitsList) {
            System.out.println(elemFruits);
        }

        fruitsList.remove(pear);
        System.out.println("List of fruits:");

        for (Fruits elemFruits:fruitsList) {
            System.out.println(elemFruits);
        }
        System.out.println("fruitsList.contains(pear) = " + fruitsList.contains(pear));
        System.out.println("fruitsList.contains(apple) = " + fruitsList.contains(apple));


        System.out.println("fruitsList.get(1).getPrice() = " + fruitsList.get(1).getPrice());

        fruitsList.set(1, lemon);
        System.out.println(fruitsList);

        System.out.println("fruitsList.size() = " + fruitsList.size());


    }
}
