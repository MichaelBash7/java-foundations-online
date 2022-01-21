package ru.itsjava.annotations;

import lombok.AllArgsConstructor;
import lombok.ToString;

@FacultyAnnotation(facultyName = "Прикладной математики")
@AllArgsConstructor
@ToString
public class MathStudent {
    private final String name;
    private final String surname;
    private final int course;
}
