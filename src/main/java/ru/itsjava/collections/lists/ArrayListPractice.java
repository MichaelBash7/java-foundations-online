package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
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

//        List <Book> emptybookList = Collections.emptyList();
//        System.out.println("bookList = " + emptybookList);
//
//
//
//        List<Book> bookList = new ArrayList<>(20);
//        Book homoSapiens = new Book("Homo Sapiens", "Harari", 589);
//        Book lordOfRings = new Book("Lord of Rings", "John Tolkien", 1560);
//        Book evgeniyOnegin = new Book("Evgeniy Onegin", "A. Pushkin", 675);
//        Book janeEyre = new Book("Jane Eyre", "C. Bronte", 342);
//        Book idiot = new Book("Idiot", "F.M. Dostoevskiy", 399);
//        Book warAndPeace = new Book ("War and Peace", "L. Tolstoy", 1352);
//        Book harryPotter = new Book("Harry Potter", "J. Rowling", 410);
//        Book nose = new Book("Nose", "Gogol", 28);
//
//
//
//        bookList.add(homoSapiens);
//        bookList.add(lordOfRings);
//        bookList.add(evgeniyOnegin);
//
//
//        System.out.println("bookList.get(0) = " + bookList.get(0));
//        System.out.println("bookList.get(2) = " + bookList.get(2));
//
//        bookList.add(0, janeEyre);
//        bookList.add(1, idiot);
//        bookList.add(2, warAndPeace);
//        bookList.add(3, harryPotter);
//        bookList.add(4, nose);

//        System.out.println("bookList = " + bookList);
//
//        bookList.set(3, lordOfRings);
//        System.out.println("bookList = " + bookList);
//
//        bookList.set(1, evgeniyOnegin);
//        System.out.println("bookList = " + bookList);
//
//        List<Book> bookList1 = new ArrayList();
//        bookList1.addAll(bookList);
//        System.out.println("bookList1 = " + bookList1);
//
//        bookList.remove(janeEyre);
//        bookList.remove(6);
//        System.out.println("bookList = " + bookList);
//
//        System.out.println("bookList.contains() = " + bookList.contains(warAndPeace));
//        System.out.println("bookList.contains() = " + bookList.contains("Borodino"));
//
//        System.out.println("bookList.toString() = " + bookList);


//        Book java1 = new Book ("Java", "Bloh J.", 101);
//        Book java2 = new Book ("Java", "Bloh J.", 102);
//        Book java3 = new Book ("Java", "Bloh J.", 103);
//        Book java4 = new Book ("Java", "Bloh J.", 104);
//
//        bookList.add(2, java1);
//        bookList.add(4, java2);
//        bookList.add(0, java3);
//        bookList.add(5, java4);
//
//        System.out.println("bookList = " + bookList);

//        System.out.println("Фильтр списка - индекс делится на 3: ");
//
//        for (int i =0; i < bookList.size(); i++) {
//            if (i % 3 == 0){
//                System.out.print(bookList.get(i));
//            }
//        }
//        System.out.println();
//
//        System.out.println("Вернуть кол-во книг, которые равны Java: ");
//
//        for (Book elemBooks : bookList) {
//            if (elemBooks.getTitle().equals("Java")) {
//                System.out.print(elemBooks + " ");
//            }
//        }
//        System.out.println();
//
//        System.out.println("Пропустить первые 3 книги в списке: ");
//
//        for (int i =3; i < bookList.size(); i++) {
//                System.out.print(bookList.get(i));
//            }
//        System.out.println();
//
//        System.out.println("Пропустить первые 2 книги равные Java:" );
//        int javaCount = 0;
//        for (int i = 0; i < bookList.size(); i++) {
//            if (bookList.get(i).getTitle().equals("Java") && javaCount < 2) {
//             javaCount++;
//            } else {
//                System.out.print(bookList.get(i));
//            }
//        }
//        System.out.println();
//
//        System.out.println("Возврашаем первую книгу, длина автора которого делится на 3");
//
//        for (Book elemBooksAuthor : bookList) {
//            if (elemBooksAuthor.getAuthor().length() % 3 == 0){
//                System.out.print(elemBooksAuthor + " ");
//                break;
//            }
//        }
//        System.out.println();
//
//        System.out.println("Возврашаем все книги, длина автора которого делится на 3");
//
//        for (Book elemBooksAuthor : bookList) {
//            if (elemBooksAuthor.getAuthor().length() % 3 == 0){
//                System.out.print(elemBooksAuthor + " ");
//            }
//        }
        System.out.println();

        Person evgeniy = new Person("Evgeniy", 23, true);
        Person nina = new Person("Nina", 20, false);
        Person polina = new Person("Polina", 27, false);
        Person nikolay = new Person("Nikolay", 19, true);
        Person boris = new Person("Boris", 15, true);
        Person alena = new Person("Alena", 46, false);

        List<Person> persons = new ArrayList<>(Arrays.asList(evgeniy, nina, polina, nikolay, boris, alena));

        System.out.println("person = " + persons);

//        System.out.println("Вывести призывников: ");
//
//        for (Person recruitPersons : persons) {
//            if (recruitPersons.isMale() == true && recruitPersons.getAge() > 18 && recruitPersons.getName().startsWith("N")) {
//                System.out.print(recruitPersons + " ");
//            }
//        }
//        System.out.println();

        System.out.println("Средний возраст всех женщин: ");

        int count = 0;
        int sumAge = 0;

        for (Person femaleAverageAge : persons) {
            if (femaleAverageAge.isMale() == false) {
                sumAge += femaleAverageAge.getAge();
                count++;
            }
        }
        System.out.println(sumAge / count);

    }
}