package ru.itsjava.oop;



public class Melon extends Fruits {



    public Melon(String name,  int price) {
        super.name = name;
        super.isOval = true;
        super.isSour = false;
        super.price = price;
    }

    public String toString (){

        return "Фрукт: " + name + " Цена: " + price;
    }


    public String toStringFruits() {


        if (this.price <= 45) {

            name = "Лайм";
            isSour = true;
            isOval = false;

        } else {

            name = "Дыня";
        }

        return "Фрукт: " + name + " Овальная: " + isOval + " Кислая: " + isSour + " Цена " + price;

    }
}
