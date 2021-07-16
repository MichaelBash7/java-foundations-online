package ru.itsjava.object;

public class ObjectPractice {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object(); //ctrl+D

        System.out.println(obj1 == obj2);

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        obj2 = obj1;

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        Dog busya = new Dog("Буся", 4);
        Dog busya2 = new Dog("Буся", 4);

        Dog sharik = new Dog("Шарик", 4);

        System.out.println("busya.equals(busya2) = " + busya.equals(busya2));
        System.out.println("busya.equals(sharik) = " + busya.equals(sharik));

        System.out.println("busya.equals(obj1) = " + busya.equals(obj1));

        System.out.println("busya.toString() = " + busya);

        System.out.println("busya.getNickname() = " + busya.getNickname());




    }
}
