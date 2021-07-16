package ru.itsjava.interfaces;

public class Fish implements Swimable{

    @Override
    public void swim() {
        System.out.println("Рыба плавает в воде");
    }

    @Override
    public double maxSwimSpeed() {
        return 60.8;
    }
}
