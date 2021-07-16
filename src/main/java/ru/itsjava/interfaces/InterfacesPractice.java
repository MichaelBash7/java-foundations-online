package ru.itsjava.interfaces;

public class InterfacesPractice {

    public static void main(String[] args) {

//        Creatable khotabych = new Gin();
//
//        khotabych.createWish();
//
//        Creatable badGin = new BadGin();
//        badGin.createWish();
//
//        Walkable dima = new Man();
//        dima.walk();
//
//        Runnable sharik = new Dog();
//        sharik.run();
//        System.out.println("sharik.maxRunDistance() = " + sharik.maxRunDistance());
//
//        Runnable murka = new Cat();
//        murka.run();
//        System.out.println("murka.maxRunDistance() = " + murka.maxRunDistance());
//
//        Flyable crow = new Bird();
//        crow.fly();
//        System.out.println("crow.flyMaxDistance() = " + crow.flyMaxDistance());
//
//        Swimable nemo = new Fish();
//        nemo.swim();
//        System.out.println("nemo.maxSwimSpeed() = " + nemo.maxSwimSpeed());
//
//        khotabych.canYouCreateWish();
//        badGin.canYouCreateWish();

        System.out.println("Человек: ");

        Eatable man = new Man();
        Talkable man1 = new Man();
        man.eat();
        man1.talk();

        System.out.println("Корова: ");

        Eatable cow = new Cow();
        Talkable burenka = new Cow();
        cow.eat();
        burenka.talk();

        System.out.println("Растение: ");

        Eatable sunflower = new Plant();
        Talkable rose = new Plant();
        sunflower.eat();
        rose.talk();

    }
}
