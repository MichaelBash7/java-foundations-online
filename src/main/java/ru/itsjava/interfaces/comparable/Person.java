package ru.itsjava.interfaces.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Person implements Comparable <Person> {
    private final String name;
    private final String surname;
    private double age;

    @Override
    public int compareTo(Person person) {
        int result = this.surname.compareTo(person.surname); //используем метод compareTo из класса String для сравнения фамилий
        //если фамилии одинаковые сравниваем имя
        if (result == 0) {
            result = this.name.compareTo(person.name);
        }
        else if (result == 0){
            result = (int) (age - person.age);
        }

        return result;

    }

}