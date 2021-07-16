package ru.itsjava.interfaces;

public interface Eatable {


    default void eat(){
        System.out.println("Я ем мясо!");
    }
}
