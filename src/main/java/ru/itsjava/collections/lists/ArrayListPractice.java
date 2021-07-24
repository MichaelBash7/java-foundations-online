package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
//        List<Watch> watchesList = new ArrayList<>();
//        Watch seiko = new Watch("Seiko", "Michael", 18000);
//        Watch gShock = new Watch("GSHOCK", "Best Dancer", 100000.0);
//
//        watchesList.add(seiko);
//        watchesList.add(gShock);
//
//        for (Watch elemWatch:watchesList) {
//            System.out.println(elemWatch);
//        }
//
////        watchesList.remove(0);
//        watchesList.remove(seiko);
//
//        System.out.println("List:");
//
//        for (Watch elemWatch:watchesList) {
//            System.out.print(elemWatch + " ");
//        }
//        System.out.println();
//
//        System.out.println("watchesList.contains(gShock) = " + watchesList.contains(gShock));
//        System.out.println("watchesList.contains(seiko) = " + watchesList.contains(seiko));
//
//        System.out.println("watchesList = " + watchesList);
//
//        System.out.println("watchesList.get(0).getFirm() = " + watchesList.get(0).getFirm());
//
//        watchesList.set(0, seiko);
//        System.out.println(watchesList);
//
//        System.out.println("watchesList.size() = " + watchesList.size());
//
//        List <Watch> watchesOmegaList = new ArrayList<>();
//
//        Watch andrewOmega = new Watch("Omega", "Andrew", 100_000.0);
//        Watch romanOmega = new Watch("Omega", "Roman", 100_000.0);
//
//        watchesOmegaList.add(andrewOmega);
//        watchesOmegaList.add(romanOmega);
//
//        System.out.println("watchesOmegaList = " + watchesOmegaList);
//
//        watchesList.addAll(watchesOmegaList);
//
//        System.out.println(watchesList);
//
//        Watch vitaliyWatch = new Watch("Seiko", "Vitaliy", 20_000.0);
//
//        watchesList.add(1,vitaliyWatch);
//        System.out.println(watchesList);

        List <Book> emptybookList = Collections.emptyList();
        System.out.println("bookList = " + emptybookList);



        List<Book> bookList = new ArrayList<>(20);
        Book homoSapiens = new Book("Homo Sapiens", "Harari", 589);
        Book lordOfRings = new Book("Lord of Rings", "John Tolkien", 1560);
        Book evgeniyOnegin = new Book("Evgeniy Onegin", "A. Pushkin", 675);
        Book janeEyre = new Book("Jane Eyre", "C. Bronte", 342);
        Book idiot = new Book("Idiot", "F.M. Dostoevskiy", 399);
        Book warAndPeace = new Book ("War and Peace", "L. Tolstoy", 1352);
        Book harryPotter = new Book("Harry Potter", "J. Rowling", 410);
        Book nose = new Book ("Nose", "N. Gogol", 28);


        bookList.add(homoSapiens);
        bookList.add(lordOfRings);
        bookList.add(evgeniyOnegin);


        System.out.println("bookList.get(0) = " + bookList.get(0));
        System.out.println("bookList.get(2) = " + bookList.get(2));

        bookList.add(0, janeEyre);
        bookList.add(1, idiot);
        bookList.add(2, warAndPeace);
        bookList.add(3, harryPotter);
        bookList.add(4, nose);

        System.out.println("bookList = " + bookList);

        bookList.set(3, lordOfRings);
        System.out.println("bookList = " + bookList);

        bookList.set(1, evgeniyOnegin);
        System.out.println("bookList = " + bookList);

        List<Book> bookList1 = new ArrayList();
        bookList1.addAll(bookList);
        System.out.println("bookList1 = " + bookList1);

        bookList.remove(janeEyre);
        bookList.remove(6);
        System.out.println("bookList = " + bookList);

        System.out.println("bookList.contains() = " + bookList.contains(warAndPeace));
        System.out.println("bookList.contains() = " + bookList.contains("Borodino"));

        System.out.println("bookList.toString() = " + bookList);


    }
}
