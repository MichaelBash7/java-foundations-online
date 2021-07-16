package ru.itsjava.interfaces;

public class Dog implements Runnable{

    @Override
    public void run() {
        System.out.println("Собака может бегать " + " Макс дистанция в км: ");
    }

    @Override
    public int maxRunDistance() {
        return 10;
    }
}
