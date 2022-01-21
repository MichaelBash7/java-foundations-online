package ru.itsjava.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class AnnotationPractice {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        Person ivan = new Person("Vanya", true);
//        System.out.println(ivan);
//
//        Class<? extends Person> aClass = ivan.getClass();
//
//        System.out.println(aClass.getName());
//        System.out.println(aClass.getSimpleName());


//        Class<?> personClass = Class.forName("ru.itsjava.annotations.Person");
//        System.out.println(personClass.getName());
//        Person vanya = (Person) personClass.getConstructor(String.class, Boolean.TYPE).newInstance("Vanya", true);
//        System.out.println(vanya);
//        System.out.println(personClass.getAnnotations()[0]);
//
//        Field isGood = personClass.getDeclaredField("isGood");
//        isGood.setAccessible(true);
//        isGood.setBoolean(vanya, false);
//        System.out.println(vanya);

        Class<?> mathStudentClass = Class.forName("ru.itsjava.annotations.MathStudent");
        MathStudent egor = (MathStudent) mathStudentClass.getConstructor(String.class, String.class, Integer.TYPE).newInstance("Egor", "Petrov", 2);
        System.out.println(egor);

        Field surname = mathStudentClass.getDeclaredField("surname");
        surname.setAccessible(true);
        surname.set(egor, "Ivanov");
        System.out.println(egor);

        System.out.println(mathStudentClass.getAnnotations()[0]);

        Class<?> biologyStudentClass = Class.forName("ru.itsjava.annotations.BiologyStudent");
        BiologyStudent sergey = (BiologyStudent) biologyStudentClass.getConstructor(String.class, String.class, Integer.TYPE).newInstance("Sergey", "Ivanov", 4);
        System.out.println(sergey);
        System.out.println(biologyStudentClass.getAnnotations()[0]);


    }
}
