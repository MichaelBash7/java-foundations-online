package ru.itsjava.iostreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOStreamsPractice {

    public static void main(String[] args) {

//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input = console.readLine();
//            System.out.println("Ваш input равен " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                console.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//        //try with resources
//
//        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
//            String input = console.readLine();
//            System.out.println("Ваш input равен " + input);
//        } catch (IOException e) {
//            e.printStackTrace();


//        File file = new File("src/main/resources/file.txt");
//
//        try (PrintWriter printWriter = new PrintWriter(file)){
//            printWriter.println("Строка1");
//            printWriter.println("Строка2");
//            printWriter.println("Строка3");
//        }catch (FileNotFoundException fileNotFoundException){
//            fileNotFoundException.printStackTrace();
//        }
//
//        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
//            String input = null;
//            while ((input = reader.readLine()) != null) {
//                System.out.println("reader.readLine() = " + input);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File myFile1 = new File("src/main/resources/myFile1.txt");
        try (PrintWriter printWriter = new PrintWriter(myFile1)) {
            printWriter.println("Я люблю Java");

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        List<String> myFile1Content = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(myFile1))) {
            while (reader.readLine() != null) {
                myFile1Content.add("Я люблю Java");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(myFile1Content);

        File myFile2 = new File("src/main/resources/myFile2.txt");
        try (PrintWriter printWriter = new PrintWriter(myFile2)) {
            printWriter.println("Я люблю домашку по потокам");

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        List<String> myFile2Content = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(myFile2))) {
            while (reader.readLine() != null) {
                myFile2Content.add("Я люблю домашку по потокам");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(myFile2Content);


        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("src/main/resources/myFile2.txt");
            fileWriter.write(String.valueOf(myFile1Content));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter fileWriter1 = null;
        try {
            fileWriter1 = new FileWriter("src/main/resources/myFile1.txt");
            fileWriter1.write(String.valueOf(myFile2Content));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}