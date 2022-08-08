package Lessons.Lesson22.OOП;

import java.sql.SQLOutput;

public class Inheritance {
    //Наследование
    //Саб-классы считаються расширенными классами. Т.к. они имеют все методы, переменные родителя и могут вмещать в себе
    // методы и переменные присущие только им.
    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.name = "Kirill";
        d.age = 37;
        d.experience = 17;
        d.specializacia = "hirurg";

        d.sleep();
        d.eat();
        d.lechit();
    }
}

class Employee {       //Класс родитель. Супер класс.
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Doctor extends Employee {   //Subclass супер класса Employee. Его "ребенок".
    //    extends - что бы сделать класс расширенным (что бы он имел все тоже,что и Employee)
    String specializacia;

    void lechit() {
        System.out.println("lechit");
    }
}

class Teacher extends Employee {   //Subclass супер класса Employee. Его "ребенок".
    int kolichesctvoUchenikov;

    void teach() {
        System.out.println("uchit");
    }

}

class Driver extends Employee {   //Subclass супер класса Employee. Его "ребенок".
    String CarName;

    void drive() {
        System.out.println("Vodit");
    }
}

class Hirurg extends Doctor {  //У саб-классов могут быть свои саб-классы
    String skalpel;
    void operacia(){
        System.out.println("Operacia");
    }
}