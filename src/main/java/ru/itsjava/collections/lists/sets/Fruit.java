package ru.itsjava.collections.lists.sets;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fruit {
    private final String type;
    private final double weight;
}
