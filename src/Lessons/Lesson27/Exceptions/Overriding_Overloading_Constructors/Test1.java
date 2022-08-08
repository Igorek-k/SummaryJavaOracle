package Lessons.Lesson27.Exceptions.Overriding_Overloading_Constructors;

import java.io.FileNotFoundException;

public class Test1 {
//* Конструктор может выбрасывать исключения. Конструктор в своей сигнатуре должен описывать все исключения конструктора
//супер класса, который он вызывает, может описывать супер классы данных исключений, а также добавлять новые исключения.

//* Вышенаписанное правило никаким образом не относится к RuntimeException.

}

class Animal2 {
    Animal2() throws FileNotFoundException {  //если конструктор супер класса объявляет Exception, то конструктор
    }                                     //его саб-класса тоже должен его объявить
}

class Mouse2 extends Animal2 {
    Mouse2() throws FileNotFoundException {
        super();
    }

}

class Human{
    String name;
    int age;
    Human(String name, int age) throws Exception{
        if(age < 0){
            throw new Exception("Некорректный возраст");
        }
        this.name = name;
        this.age = age;
    }
}
