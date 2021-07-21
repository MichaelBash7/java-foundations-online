package ru.itsjava.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    public static final String DEFAULT_PERSON = "Mikhail";
    public static final int DEFAULT_AGE = 26;
    public static final int NEW_AGE = 12;

    @DisplayName("Класс Person должен: ")
    @Test

    public void shouldHaveCorrectConstructor(){

        Person actualPerson = new Person(DEFAULT_PERSON, DEFAULT_AGE);

        assertAll("actualPerson", () -> assertEquals(DEFAULT_PERSON, actualPerson.getName()),
                () -> assertEquals(DEFAULT_AGE, actualPerson.getAge()));

    }
    @DisplayName("Изменять возраст корректно")
    @Test
    public void shouldChangeNameCorrectly (){

        Person actualPerson = new Person(DEFAULT_PERSON, DEFAULT_AGE);

        actualPerson.setAge(NEW_AGE);
        assertEquals(NEW_AGE, actualPerson.getAge());
    }

    @DisplayName(" Иметь корректную работу методов")
    @Test
    public void shouldHaveCorrectMethods (){

        Person actualPerson = new Person(DEFAULT_PERSON, DEFAULT_AGE);
        actualPerson.birthday();
        assertEquals(27, DEFAULT_AGE + 1);
        actualPerson.takeBeer();
        assertTrue(DEFAULT_AGE > 18);
        assertTrue(NEW_AGE < 18);

    }
}
