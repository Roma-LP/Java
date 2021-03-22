package by.work;

import by.Other.SpecialityFIT;
import by.faculty.Dekan;
import by.faculty.Faculty;
import by.university.People;
import by.university.Student;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    static Logger LOGGER;
   /* static {
        try(FileInputStream ins = new FileInputStream("C:\\БГТУ\\СТПвInternet\\lab_3\\lib")){ //полный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Main.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }*/

    public static void main(String[] args) {


      //  LOGGER.log(Level.INFO,"Начало main, создаем лист");

	People IvanIvanov = new People("Ivan","Ivanov",19,true);
	People VasaVasiliev = new People("Vasa","Vasiliev",24,true);
	People PetyaPetrov = new People("Petya","Petrov",17,true);
	People PolinaPolinovna = new People("Polina","Polinovna",20,false);
	People AlinaALinev = new People("Alina","Alinev",21,false);
	People MishaMishanya = new People("Misha","Mishanya",18,true);
	People DimaDmitry = new People("Dima","Dmitry",22,true);
	People GorgGorgovich = new People("Gorg","Gorgovich",23,true);

        ArrayList<People> str = new ArrayList<People>();
                str.add(IvanIvanov);
                str.add(VasaVasiliev);
                str.add(PetyaPetrov);
                str.add(PolinaPolinovna);
                str.add(AlinaALinev);
                str.add(MishaMishanya);
                str.add(DimaDmitry);
                str.add(GorgGorgovich);
        for(People pl : str)
        {
            System.out.println(pl.toString());
        }


        Student std1 = new Student(IvanIvanov,2,5);
        Student std2 = new Student(VasaVasiliev,3,7);
        Student std3 = new Student(PetyaPetrov,4,1);
        Student std4 = new Student(PolinaPolinovna,1,3);
        Student std5 = new Student(AlinaALinev,2,10);
        Student std6 = new Student(MishaMishanya,4,1);
        Student std7 = new Student(DimaDmitry,2,5);
        Student std8 = new Student(GorgGorgovich,1,4);

        ArrayList<Student> std = new ArrayList<Student>();
        std.add(std1);
        std.add(std2);
        std.add(std3);
        std.add(std4);
        std.add(std5);
        std.add(std6);
        std.add(std7);
        std.add(std8);
        for(Student pl : std)
        {
            System.out.println(pl.toString());
        }


        Faculty FITPOIT = new Faculty("InformationTechnologies", SpecialityFIT.POIT,new Student[]{std1,std7,std8});
        Faculty FITISIT = new Faculty("InformationTechnologies",SpecialityFIT.ISIT,new Student[]{std2});
        Faculty FITDESIGN = new Faculty("InformationTechnologies",SpecialityFIT.DESIGN, new Student[]{std4,std5});
        Faculty FITPOIBM = new Faculty("InformationTechnologies",SpecialityFIT.POIBM,new Student[]{std3,std6});

        ArrayList<Faculty> fac = new ArrayList<Faculty>();
        fac.add(FITPOIT);
        fac.add(FITISIT);
        fac.add(FITDESIGN);
        fac.add(FITPOIBM);
        for(Faculty pl : fac)
        {
            System.out.println(pl.toString());
        }


        Dekan dekan = new Dekan("Shiman",new Faculty[]{FITPOIT,FITISIT,FITDESIGN,FITPOIBM});
        System.out.println(dekan.toString());


        System.out.println("Количество: "+dekan.ListStudentByCourse(2).size()+'\n'+dekan.ListStudentByCourse(2));
        System.out.println("Количество: "+dekan.ListStudentBySpecialty(SpecialityFIT.DESIGN).size()+'\n'+dekan.ListStudentBySpecialty(SpecialityFIT.DESIGN));


        System.out.println(dekan.getFaculty());
        dekan.SortStudentByNameCourse();
        System.out.println(dekan.getFaculty());

    }
}
