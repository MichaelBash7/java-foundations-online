package ru.itsjava.interfaces.cloneable;

public class CloneablePractice {

    public static void main(String[] args) throws CloneNotSupportedException {

//        Girl dasha = new Girl("Dasha", 160);
//
//        Girl dasha2 = (Girl) dasha.clone();
//
//        System.out.println("dasha = " + dasha);
//        System.out.println("dasha2 = " + dasha2);

        Person irina = new Person("Irina", "Emelina", 36);
        Person irina2 = (Person) irina.clone();

        System.out.println("irina = " + irina);
        System.out.println("irina2 = " + irina2);


    }
}
