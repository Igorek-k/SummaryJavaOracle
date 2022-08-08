package Lessons.Lesson27.Exceptions.Subclasses.RuntimeExceptions;

import java.util.*;

public class RuntimeException {

//* Саб-классы RuntimeException так же называются - unchecked exceptions(не обязательны к проверке)

//* Runtime исключения бывают в коде, в котором присутствуют ошибочные выражения. Т.е. в выбросе данных исключений
// виноват программист. Компилятор НЕ в состоянии проверить возможность выброса runtime исключений.
// * Runtime исключения можно не объявлять и не обрабатывать, но при желании можно сделать и то, и другое.

    static ArrayList<String> list1;
    static Doctor [] array;

    public static void main(String[] args) {

//                   | Распространенные саб-классы RuntimeException: |
//*    ArrayIndexOutOfBoundsException - выбрасывается тогда, когда мы используем элемент массива меньше нуля или больше
//    длины массива.
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.get(4));
//        ArrayIndexOutOfBoundsException sub-class IndexOutOfBoundsException!

//* IndexOutOfBoundsException

//* ArithmeticException - выбрасываеться когда хотим число делить на ноль
        System.out.println(5 / 0);

//* ClassCastException
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Employee[] array = {d, t};
        Teacher t2 = (Teacher) array[0];
        //Teacher не может быть на месте Teacher

//* IllegalArgumentException - выбрасывается при написании не правильного аргумента или параметра
        RuntimeException rte = new RuntimeException(); //Пример в написании этом методе:
        rte.createPwd("qwerty");  //в подобных методах программисты часто используют такое исключение

//* IllegalStateException - выбрасывается, когда что-то очень не в тему. Пример в написании этих методах
        Samolet s = new Samolet();
        s.ojidat();
        s.letit();
        s.otmePoleta();

//* NullPointerException - неправильное взаимодействие с null объектами
        list1.add("!!!");
        //list1 null ,а мы пытаемся добавить к нему "!!!"
        System.out.println(array[0]);
        //пытаемся вывести элемент массива, когда массив = null

//* NumberFormatException - наследник IllegalArgumentException
        Integer.parseInt("44kjk"); //из-за лишних символов этот String не может быть переделан в Integer
    }

//--------------------------------------------------------------------------------------------------------------------\\

    public void createPwd(String pdw) {
        if (pdw.length() < 6) {
            throw new IllegalArgumentException("Dlina parolya slishkom malenkaya");
        }
        if (pdw.length() > 12) {
            throw new IllegalArgumentException("Dlina parolya slishkom bolshaya");
        }
        System.out.println("Parol prinyat");
    }
}

class Employee {
}

class Doctor extends Employee {
}

class Teacher extends Employee {
}

class Samolet {
    String sostoyanie = "v ojidanii";

    public void letit() {
        sostoyanie = "v vozduhe";
        System.out.println("Samolet letit");
    }

    public void ojidat() {
        if (sostoyanie.equals("v vozduhe")) {
            throw new IllegalStateException("Samolet uje v vozduhe");
        }
        sostoyanie = "v ojidanii";
        System.out.println("Samolet v ojidanii poleta");
    }

    public void otmePoleta() {
        if (sostoyanie.equals("v vozduhe")) {
            throw new IllegalStateException("Samolet uje v vozduhe");
        }
        sostoyanie = "polet otmenen";
        System.out.println("Polet samoleta otmanen");
    }

    public static void main(String[] args) {
        Samolet s = new Samolet();
        s.ojidat();
        s.letit();
        s.otmePoleta();
    }
}
