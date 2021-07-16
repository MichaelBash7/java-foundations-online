package ru.itsjava.oop;


public class Crow extends Birds{


    public Crow(String name, int lifespan) {
        super.name = name;
        super.eatsMeat = true;
        super.lifespan = lifespan;
    }

    public String recognizeBird () {


        if (lifespan > 15) {

            name = "Попугай";

        } else {

            name = "Ворона";

        }

    return "Название птицы: " + name + " Ест мясо: " + eatsMeat + " Продолжительность жизни: " + lifespan;
    }
}
