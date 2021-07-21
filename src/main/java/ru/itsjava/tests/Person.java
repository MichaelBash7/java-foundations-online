package ru.itsjava.tests;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Person {
    private final String name;
    private int age;


    public void birthday() {
        System.out.println(age + 1);
    }

    public boolean takeBeer() {
        if (age > 18)
            return true;
        else {
            return false;
        }
    }
}
