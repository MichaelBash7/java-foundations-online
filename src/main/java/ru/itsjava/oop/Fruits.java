package ru.itsjava.oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fruits {
    public String name;
    public boolean isOval;
    public boolean isSour;
    public int price;

//    public Fruits (){

//    }
//    public Fruits (String name, int price){
//        this.name = name;
//        this.price = price;
//    }
//
//    public Fruits(String name, boolean isOval, boolean isSour, int price) {
//        this.name = name;
//        this.isOval = isOval;
//        this.isSour = isSour;
//        this.price = price;
//    }
//
//    public void fruits() {
//        System.out.println("Фрукты");
//    }
//
//
//
//    public boolean equals(Object o) { //объект на вход
//        if (this == o) return true; //ссылаемся на один и тот же объект
//        if (o == null || getClass() != o.getClass()) return false; // если объект null или не принадлежит этому классу - false
//
//        Fruits fruits = (Fruits) o; //приводим тип данных
//
//        if (price != fruits.price) return false; //если цена не совпадает - false
//        return name != null ? name.equals(fruits.name) : fruits.name == null; //если цена совпадает сравниваем имя
//}
//    @Override
//    public int hashCode() {
//        return name.hashCode();
//    }
}