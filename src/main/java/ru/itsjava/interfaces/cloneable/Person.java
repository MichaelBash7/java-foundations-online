package ru.itsjava.interfaces.cloneable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Person implements Cloneable{
    private final String name;
    private final String surname;
    private double age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
