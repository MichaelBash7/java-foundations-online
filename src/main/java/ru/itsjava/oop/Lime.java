package ru.itsjava.oop;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Lime extends Fruits {



    public Lime(String name, int price) {
        super.name = name;
        super.isOval = false;
        super.isSour = true;
        super.price = price;
    }

    public String toStringFruits() {


        if (this.price > 45) {

            name = "Дыня";
            isSour = false;
            isOval = true;

        } else {

            name = "Лайм";
        }


        return "Фрукт: " + name + " Овальный: " + isOval + " Кислый: " + isSour + " Цена: " + price;
    }


    }