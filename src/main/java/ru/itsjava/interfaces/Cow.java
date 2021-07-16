package ru.itsjava.interfaces;

public class Cow implements Talkable, Eatable{

    @Override
    public void talk() {
        System.out.println("Я говорю - мууууу!");
    }

    @Override
    public void eat() {
        System.out.println("Я ем травку!");


    }
}
