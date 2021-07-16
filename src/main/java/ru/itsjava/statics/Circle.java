package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Figure{
    public final static double PI = 3.14159265;

    @Override
    void figureArea() {
        System.out.println("Площадь круга: S = PI * r2");
    }
}