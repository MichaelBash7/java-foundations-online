package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {
    private String company;
    private String color;
    public static double price = 2_000_000.0;

public String toString (){
return "Марка машины: " + company + " Цвет: " + color + " Цена: " + price;
}
}