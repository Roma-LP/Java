package by.university;

import by.faculty.Faculty;

public class Student {
    People people;
    int course;         // номер курса
    int group;          // группа

    public int getCourse() {
        return course;
    }


    public People getPeople() {
        return people;
    }

    public int getGroup() {
        return group;
    }

    public Student(People people, int course, int group) {
        this.people = people;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "people=" + people +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
