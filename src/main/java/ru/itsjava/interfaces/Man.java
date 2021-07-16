package ru.itsjava.interfaces;

import lombok.AllArgsConstructor;

import javax.swing.*;

@AllArgsConstructor
public class Man implements Talkable, Eatable{

//    @Override
//    public void walk() {
//        System.out.println("Человек может ходить");


    @Override
    public void talk() {
        System.out.println("Я могу разговаривать");
    }

}

