package Homework.Homework16;

import java.sql.SQLOutput;

public class Homework {
    public static void email(String parametr){
        int a = 0; //позиция символа "@"
        int b =0 ; //позиция символа "."
        int c = 0; //позиция символа ";"
        while (c<parametr.length() -1){
            a = parametr.indexOf('@',c);
            b = parametr.indexOf('.',c);
            c = parametr.indexOf(';',c+1);
            System.out.println(parametr.substring(a+1,b));
        }

    }

    public static void main(String[] args) {
        email("ya@yahoo.com;  on@mail.ru;  ona@gmail.com;");
    }
}
