package ru.itsjava.interfaces;

public class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("Птица летает");
    }

    @Override
    public String flyMaxDistance() {
        return "Максимальная дистанция полета - 1000 км";
    }
}
