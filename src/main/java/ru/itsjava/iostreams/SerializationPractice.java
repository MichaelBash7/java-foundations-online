package ru.itsjava.iostreams;

import org.w3c.dom.ls.LSOutput;
import ru.itsjava.collections.lists.maps.Man;

import java.io.*;

public class SerializationPractice {

    public static void main(String[] args) {
//        Man man = new Man("Vitalik");
//
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/man.out"))){
//            outputStream.writeObject(man);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try(ObjectInputStream inputStream = new ObjectInputStream(
//                new FileInputStream("src/main/resources/man.out"))){
//            Object obj = inputStream.readObject();
//            Man man = (Man) obj;
//            System.out.println("man =" + man);
//        }catch (IOException | ClassNotFoundException exception){
//            exception.printStackTrace();
//        }

//        User user = new User("Mikhail", "birthday123");
//
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/user.txt"))){
//            outputStream.writeObject(user);
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/main/resources/user.txt"))){
            Object obj = inputStream.readObject();
            User user = (User) obj;
            System.out.println("User = " + user);
        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }


    }
}
