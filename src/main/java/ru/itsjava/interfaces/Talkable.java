package ru.itsjava.interfaces;

public interface Talkable {

    default void talk(){
        System.out.println("Я не могу разговаривать");
    }
}
