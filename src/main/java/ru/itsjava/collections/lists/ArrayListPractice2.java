package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        Watch vitaliySeiko = new Watch("Seiko", "Vitaliy", 18_000.0);
        Watch viktorSeiko = new Watch("Seiko", "Viktor", 18_000.0);
        Watch dmitriySeiko = new Watch("Seiko", "Dmitriy", 30_000.0);
        Watch valentinOmega = new Watch("Omega", "Valentin", 100_000.0);

        List<Watch> watches = new ArrayList<>(Arrays.asList(vitaliySeiko, viktorSeiko, dmitriySeiko, valentinOmega));

        System.out.println("Наши часы: " + watches);

        //Вывести все чвсы у которых фирма Seiko

        System.out.println("Вывести все чвсы у которых фирма Seiko");
        for (Watch elemWatch : watches) {
            if (elemWatch.getFirm().equals("Seiko")) {
                System.out.println(elemWatch + " ");

            }
        }
        System.out.println();

        //Вывести все часы у которых цена > 25000.0

        System.out.println("Вывести все часы у которых цена > 25000.0");
        for (Watch expensiveWatch : watches) {
            if (expensiveWatch.getPrice() > 25000.0) {
                System.out.println(expensiveWatch + " ");
//                break; //если одни часы
            }
        }
        System.out.println();

        //пропустить первые 2 элемента
        System.out.println("Пропустить первые 2 элемента фирмы Seiko");

        int seikoCount = 0;

        for (int i = 0; i < watches.size(); i++) {
            if (watches.get(i).getFirm().equals("Seiko") && seikoCount < 2) {
                seikoCount++;
            } else {
                System.out.println(watches.get(i));
            }

        }
    }
}