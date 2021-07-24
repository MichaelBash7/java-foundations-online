package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private final String title;
    private final String author;
    private int numberOfPages;

    @Override
public String toString(){
        return "Book {" + title +", " + author +", " + numberOfPages + "}";
    }

}
