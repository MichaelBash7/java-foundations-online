package ru.itsjava.annotations;

import lombok.AllArgsConstructor;
import lombok.ToString;

@FacultyAnnotation(facultyName = "Молекулярной биологии")
@AllArgsConstructor
@ToString
public class BiologyStudent {
    private final String name;
    private final String surname;
    private final int course;
}
