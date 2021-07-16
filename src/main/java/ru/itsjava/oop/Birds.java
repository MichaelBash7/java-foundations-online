package ru.itsjava.oop;

import lombok.*;

@Data
@RequiredArgsConstructor


public class Birds {
    public String name;
    public boolean eatsMeat;
    public int lifespan;

//public Birds(){
//
//}
//    public Birds (String name, int lifespan) {
//        this.name = name;
//        this.lifespan = lifespan;
//    }

//    public String toString(){
//        return "{ Название птицы: " + name + "продолжительность жизни: " + lifespan + "}";
//    }
    //    public String recognizeBird () {
//
//
//        if (lifespan > 15) {
//
//            name = "Попугай";
//
//        } else {
//
//            name = "Ворона";
//
//        }
//
//    return "Название птицы: " + name + " Ест мясо: " + eatsMeat + " Продолжительность жизни: " + lifespan;
//    }
}

