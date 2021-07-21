package ru.itsjava.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class PersonExceptions {
    private String name;
    private int age;



public void checkAge () throws AgeNotValidException {
        if (age < 0) {
        throw new AgeNotValidException("Age " + age + " too young");
    }else if (age > 150){
            throw  new AgeNotValidException("Age " + age + " too old");
        }
    System.out.println("Age" + age + "OK!");
}

}