package ru.itsjava.interfaces;

public class Cat implements Runnable{

    @Override
    public void run() {
        System.out.println("Кошка может бегать " + " Макс дистанция в км: ");
    }

    @Override
    public int maxRunDistance() {
        return 10;
    }
}
