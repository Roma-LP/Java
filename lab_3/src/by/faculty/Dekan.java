package by.faculty;

import by.Other.InterfaceOne;
import by.Other.SpecialityFIT;
import by.university.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Dekan implements InterfaceOne {
    String name;
    Faculty[] faculty;

    public Dekan(String name, Faculty[] faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return Arrays.toString(faculty);
    }

    @Override
    public String toString() {
        return "Dekan{" +
                "name='" + name + '\'' +
                ", faculty=" + Arrays.toString(faculty) +
                '}';
    }

    public ArrayList ListStudentByCourse(int course){
        ArrayList<Student> st = new ArrayList<Student>();
        for(int i=0;i<faculty.length;i++){
            for (int j=0;j<faculty[i].student.length;j++){
                if(faculty[i].student[j].getCourse()==course){
                    st.add(faculty[i].student[j]);
                }
            }
        }
        return st;
    }

    public ArrayList ListStudentBySpecialty(SpecialityFIT specialty){
        ArrayList<Student> st = new ArrayList<Student>();
        for(int i=0;i<faculty.length;i++) {
            if (faculty[i].getSpecialty().equals(specialty)) {
                for (int j = 0; j < faculty[i].student.length; j++) {
                    st.add(faculty[i].student[j]);
                }
            }
        }
        return st;
    }

    public void SortStudentByNameCourse(){
        for(int i=0;i<faculty.length;i++) {
            for (int j=0;j<faculty[i].student.length;j++){
                // 2. sort using comparator: sort by id
                Arrays.sort(faculty[i].student, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getPeople().getName().compareTo(o2.getPeople().getName());
                    }
                });
                Arrays.sort(faculty[i].student, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getCourse() - o2.getCourse();
                    }
                });
            }
        }
    }


    @Override
    public void DoSmth(){
        System.out.println("Call Interface");
    }


}
