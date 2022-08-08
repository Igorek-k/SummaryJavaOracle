package Lessons.Lesson24.Class_AND_Interface;

public class TEST {
//*** class & interface inheritance:
//* Класс может наследовать 0 или 1 класс. Для наследования класс использует keyword “extends”.
//* Класс может имплементировать 0 или более интерфейсов. Для имплементирования класс использует keyword “implements”.
//* Класс не может наследовать интерфейс.
//* Интерфейс не может наследовать или имплементировать класс.
//* Интерфейс может наследовать 0 или более интерфейсов. Для наследования интерфейс использует keyword “extends”.
//* Конкретный класс может наследовать конкретный или абстрактный класс.
//* abstract класс может наследовать конкретный или абстрактный класс и имплементировать интерфейс.
//* Первый конкретный класс в иерархии должен снабдить все abstract методы телами.

    public static void main(String[] args) {
A a = new Human();
A b = new Animal();
    }
}

class Human implements A {

}

class Animal implements A {

}

interface A {

}

interface C{

}

interface B extends A,C {   //интерфейсы могут наследовать более одного интерфейса

}

abstract class D implements A,C{  //абстрактный класс имплементирует интерфейс

}