package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {

//        String name = "Mikhail";
//        String copyName = "Mikhail";
//
//        System.out.println("(name == copyName) = " + (name == copyName));
//
//        String constructorName = new String("Mikhail");
//        System.out.println("(constructorName == name) = " + (constructorName == name));
//        String internConstructorName  = constructorName.intern();
//        System.out.println("(internConstructorName == name) = " + (internConstructorName == name));

        String str = "Я строка";

        System.out.println("str.length() = " + str.length());//длина строки
        System.out.println("str.isEmpty() = " + str.isEmpty());//пустая ли строка

        System.out.println("str.equals(\"Я строкА\") = " + str.equals("Я строкА"));//проверка идентична ли строка указанному объекту
        System.out.println("str.equals(\"Я строкА\") = " + str.equalsIgnoreCase("Я строкА"));//если строки одинаковы,  то true

        String[] strs = str.split(" ");
        System.out.println(strs[0]);
        System.out.println(strs[1]);

        char [] result = str.toCharArray();//преобразует к массиву char исходную строку
        System.out.println("Массив чаров:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Element [" + i + "]" + result[i]);
        }


//        StringBuilder builderStr = new StringBuilder(str);
//        for (int i = 0; i < 1_000_000; i++) {
//            builderStr.append("!"); // добавление символов в StringBuilder
//        }
//        System.out.println(builderStr.toString());

        System.out.println("str.toUpperCase() = " + str.toUpperCase());//преобразует строку к верхнему регистру
        System.out.println("str.toLowerCase() = " + str.toLowerCase());//преобразует строку к нижнему регистру
        System.out.println("str.substring(2,4) = " + str.substring(2, 4)); //возвращает подстроку от beginIndex до endIndex
        System.out.println("str.substring(2) = " + str.substring(2));//возвращает подстроку от beginIndex до конца

        System.out.println(str.replace("о", "ю"));// поменять один чар на другой


    }
}