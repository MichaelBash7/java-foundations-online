package ru.itsjava.collections.lists.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
//        Map<Man, String> men = new HashMap<>();
//        Man ivanov = new Man("Ivanov");
//        Man sidorov = new Man("Sidorov");
//        Man javov = new Man("Javov");
//
//        men.put(ivanov, "T-shirt");
//        men.put(sidorov, "Sweatshirt");
//        men.put(javov, "Sweater");
//
//        for (Map.Entry<Man, String> pair : men.entrySet()) {
//            System.out.println(pair.getKey() + ": " + pair.getValue());
//        }
//
//        System.out.println("-------------");
//        for (Man keyMan : men.keySet()){
//            System.out.println(keyMan + ": " + men.get(keyMan));
//        }
//
//        System.out.println("men.remove(ivanov) = " + men.remove(ivanov));
//
//        System.out.println("After delete Ivanov");
//        for (Man keyMan : men.keySet()){
//            System.out.println(keyMan + ": " + men.get(keyMan));
//        }
//
//        System.out.println("men.size() = " + men.size());
//        System.out.println("men.isEmpty() = " + men.isEmpty());
//
//        System.out.println("men.replace(javov, \"Sweater\", \"Gloves\") = " + men.replace(javov, "Sweater", "Gloves"));
//        System.out.println(men.get(javov));
//
//        men.clear();
//
//        System.out.println("men.size() = " + men.size());

        Map<String, Fruit> fruitShop = new HashMap<>();
        Fruit strawberry = new Fruit("Strawberry", 12.3);
        Fruit apple = new Fruit("Apple", 37.9);
        Fruit peach = new Fruit("Peach", 25.5);
        Fruit pear = new Fruit("Pear", 15.4);
        Fruit melon = new Fruit("Melon", 65.7);


        fruitShop.put("Mikhail", strawberry);
        fruitShop.put("Oleg", apple);
        fruitShop.put("Andrey", peach);
        fruitShop.put("Egor", pear);
        fruitShop.put("Nikita", melon);


        System.out.println("fruitShop.get(\"Oleg\") = " + fruitShop.get("Oleg"));

        fruitShop.remove("Egor", pear);

        System.out.println("fruitShop.containsKey(\"Mikhail\") = " + fruitShop.containsKey("Mikhail"));
        System.out.println("fruitShop.containsValue(pear) = " + fruitShop.containsValue(pear));

        System.out.println("-------");
        for (String keyCustomer : fruitShop.keySet()) {
            System.out.println(keyCustomer + ": " + fruitShop.get(keyCustomer));

        }

        System.out.println("--------");
        for (Fruit values : fruitShop.values()) {
            System.out.println(values + ": " + fruitShop.get(values));
        }

        System.out.println("-------");

        for (Map.Entry<String, Fruit> pair : fruitShop.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }




    }
}
