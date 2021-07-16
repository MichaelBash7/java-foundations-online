package ru.itsjava.oop;


public class Parrot extends Birds {

    public Parrot(String name, int lifespan) {
        super.name = name;
        super.eatsMeat = false;
        super.lifespan = lifespan;
    }

    public String recognizeBird () {


        if (this.lifespan > 15) {

            name = "Попугай";

        } else {

            name = "Ворона";
        }
        return "Название птицы: " + name + " Ест мясо: " + eatsMeat + " Продолжительность жизни: " + lifespan;
    }
}