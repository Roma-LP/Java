package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    static int sint;
    final int final_int=71;
    public final int publfinal_int=45;
    public static final int publstfinal_int=4;

    public static void main(String[] args) {
	System.out.println("Hello,world!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        TestClass test1 = new TestClass();
        System.out.println(test1.getValue());
        byte a = 3;
        short b = 4;
        //TODO double->float->long->int
        byte c = (byte) (a+b);
        c='a';
        System.out.println(c);

        System.out.println("static int: "+sint);

        //System.out.println("final int: "+ final_int);
        //System.out.println("public final int: "+ publfinal_int);
        System.out.println("public static final int: "+ publstfinal_int);

        System.out.println("Math.PI: "+Math.PI);
        System.out.println("Math.E: "+ Math.E);
        System.out.println("min: "+Math.min(round(PI),round(E)));
        for(int i=0;i<10;i++) {
            System.out.println("Math.random() [0,1) - " + Math.random());
        }

        Integer intg1 = new Integer(432);
        Integer intg0 = 432;
        String str1 = intg1.toString();
        System.out.println("str1: "+str1);
        System.out.println("Float.MAX_VALUE: "+Float.MAX_VALUE);
        String str2 = "1166628";
        Integer xx = Integer.parseInt(str2);
        System.out.println("str2: "+xx);
        int x = 34;
        Integer y = 629;
        x = y; // автораспаковка
        y = x * 123; // автоупаковка

        int[] array = new int[] { 1, 2, 3, 4, 5 };
        ArrayList<String> str0 = new ArrayList<String>();
        str0.add("wrefs");
        str0.add("sdsds");
        str0.add("jkjkk");
        //TODO метод forEach который принимает лямбда-выражение
        str0.forEach((primer)->System.out.println(primer));

        for (int i : array){ // цикл foreach
            System.out.println(i);
        }

        String str3 = "Erefcvetrex";
        WrapperString ws = new WrapperString(str3);
        ws.replace('e','c');
        System.out.println("WrapperString: "+ws.getStr());
        // анонимный класс
        WrapperString anonimObj = new WrapperString(str3) {
            // замена последего символа
            @Override
            public void replace() {
                System.out.println("из анонимного класса replace()");
            }
        }; // конец объявления анонимного класса
        ws.replace();
        anonimObj.replace();
    }
}
