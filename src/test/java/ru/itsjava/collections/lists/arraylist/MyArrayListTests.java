package ru.itsjava.collections.lists.arraylist;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTests {

    @DisplayName("Проверяем методы get/add в MyArrayList")
    @Test
        public void shouldHaveCorrectGetAndAddMethods () {

        MyArrayList list = new MyArrayList();
        list.add("elem1");
        list.add("elem2");

        assertEquals("elem1", list.get(0));
    }
        @DisplayName("Проверяем метод set в MyArrayList")
        @Test
        public void shouldHaveCorrectSetMethod () {
            MyArrayList list = new MyArrayList();
            list.add("elem1");
            list.add("elem2");
            list.set(1, "element777");
            assertEquals("element777", list.get(1));
        }
    @DisplayName("Проверяем метод size в MyArrayList")
    @Test
    public void shouldHaveCorrectSizeMethod () {
        MyArrayList list = new MyArrayList();
        list.add("elem1");
        list.add("elem2");
        list.size();
        assertEquals(2, list.size());

    }
    @DisplayName("Проверяем метод isEmpty в MyArrayList")
    @Test
    public void shouldHaveCorrectIsEmptyMethod () {

        MyArrayList list = new MyArrayList();
        list.add("elem1");
        list.add("elem2");
        assertFalse(list.isEmpty());
    }
    @DisplayName("Проверяем метод contains в MyArrayList")
    @Test
        public void shouldHaveCorrectContainsMethod () {

            MyArrayList list = new MyArrayList();
            list.add("elem1");
            list.add("elem2");

            assertTrue(list.contains("elem1"));
        }

        @DisplayName("Проверяем методы remove в MyArrayList")
        @Test
        public void shouldHaveCorrectRemoveMethods () {

            MyArrayList list = new MyArrayList();
            list.add("elem1");
            list.add("elem2");
            list.add("elem3");

            list.remove(2);
            assertNull(list.get(2));

            assertTrue(list.remove("elem1"));
        }

        @DisplayName("Проверяем метод clear в MyArrayList")
        @Test
        public void shouldHaveCorrectClearMethod () {

            MyArrayList list = new MyArrayList();
            list.add("elem1");
            list.add("elem2");
            list.add("elem3");

            list.clear();
            assertNull(null, "size () = 0");
        }

    @DisplayName("Проверяем методы indexOf/lastIndexOf в MyArrayList")
    @Test
    public void shouldHaveCorrectIndexOfMethod () {

        MyArrayList list = new MyArrayList();
        list.add("elem1");
        list.add("elem2");
        list.add("elem3");

        assertEquals(0, list.indexOf("elem1"));
        assertEquals(1, list.lastIndexOf("elem2"));

    }
}