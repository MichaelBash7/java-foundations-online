package ru.itsjava.interfaces;

public class Plant implements Talkable, Eatable{

    @Override
    public void eat() {
        System.out.println("Я питаюсь энергией солнца");
    }
}
