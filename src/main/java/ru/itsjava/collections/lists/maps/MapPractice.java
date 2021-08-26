package ru.itsjava.collections.lists.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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
        Fruit watermelon = new Fruit("Watermelon", 65.7);


        fruitShop.put("Mikhail", strawberry);
        fruitShop.put("Oleg", apple);
        fruitShop.put("Andrey", peach);
        fruitShop.put("Egor", pear);
        fruitShop.put("Nikita", watermelon);


//        System.out.println("fruitShop.get(\"Oleg\") = " + fruitShop.get("Oleg"));
//
//        fruitShop.remove("Egor", pear);
//
//        System.out.println("fruitShop.containsKey(\"Mikhail\") = " + fruitShop.containsKey("Mikhail"));
//        System.out.println("fruitShop.containsValue(pear) = " + fruitShop.containsValue(pear));
//
//        System.out.println("-------");
//        for (String keyCustomer : fruitShop.keySet()) {
//            System.out.println(keyCustomer + ": " + fruitShop.get(keyCustomer));
//
//        }
//
//        System.out.println("--------");
//        for (Fruit values : fruitShop.values()) {
//            System.out.println(values + ": " + fruitShop.get(values));
//        }
//
//        System.out.println("-------");
//
//        for (Map.Entry<String, Fruit> pair : fruitShop.entrySet()){
//            System.out.println(pair.getKey() + ": " + pair.getValue());
//        }

        System.out.println("Iterator practice: ");

        System.out.println("Кол-во покупателей, чье имя больше 5: ");

        Iterator<String> iterator = fruitShop.keySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            String keyCustomer = iterator.next();
            if (keyCustomer.length() > 5) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("Кол-во фруктов, которые равны apple: ");

        Iterator<Fruit> valuesIterator = fruitShop.values().iterator();
        int fruitsCount = 0;
        while (valuesIterator.hasNext()){
            Fruit values = valuesIterator.next();
            if (values.equals(apple)){
                fruitsCount++;
            }
        }
        System.out.println(fruitsCount);

        System.out.println("Пропустить 2 элемента со значением watermelon: ");

        Iterator<Fruit> valuesElem = fruitShop.values().iterator();
        int elemCount = 0;
        while (valuesElem.hasNext()) {
            Fruit values = valuesElem.next();
            if (values.getType().equals("Watermelon") && elemCount < 2) {
                elemCount++;
            }else{
                System.out.println(values);
            }
        }

        System.out.println("Пропустить элементы начинающиеся на А: ");

        Iterator<Fruit> letterA = fruitShop.values().iterator();
        int letterCount = 0;
        while (letterA.hasNext()) {
            Fruit values = letterA.next();
            if (values.getType().startsWith("A") && letterCount < 2) {
                letterCount++;
            }else{
                System.out.println(values);
            }
        }

        System.out.println("Вернуть первый элемент значение которого Watermelon/watermelon/WATERMELOn: ");

        Iterator<Fruit> firstElem = fruitShop.values().iterator();

        while (firstElem.hasNext()) {
            Fruit values = firstElem.next();
            if (values.getType().equals("Watermelon") || values.getType().equals("WATERMELOn")) {
                System.out.println(values);
                break;
            }
        }

        System.out.println("Вернуть все элементы (фрукты) в другую карту: ");

        Map<String, Fruit> movedFruits = new HashMap<>();

        movedFruits.putAll(fruitShop);
        System.out.println(movedFruits);

        System.out.println("Вычисляем средний вес всех фруктов: ");

        Iterator<Fruit> averageWeight = fruitShop.values().iterator();
        double weightCount = 0.0;
        double sumWeight = 0.0;
        while (averageWeight.hasNext()) {
            Fruit values = averageWeight.next();
            if (values.getWeight() != 0) {
                sumWeight += values.getWeight();
                weightCount++;
            }
        }
        System.out.println(sumWeight/weightCount);

    }
}
