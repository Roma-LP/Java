package by.faculty;


import by.Other.SpecialityFIT;
import by.university.Student;

import java.util.Arrays;

public class Faculty {
    String name;        // название факультет
    SpecialityFIT specialty;   // специальность
    Student student[];

    public String getName() {
        return name;
    }

    public String getStudent() {
        return Arrays.toString(student);
    }

    public SpecialityFIT getSpecialty() {
        return specialty;
    }

    public Faculty(String name, SpecialityFIT specialty, Student[] student) {
        this.name = name;
        this.specialty = specialty;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", specialty=" + specialty +
                ", student=" + Arrays.toString(student) +
                '}';
    }
}
