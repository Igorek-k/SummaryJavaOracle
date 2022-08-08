package Lessons.Lesson24.Inteface;

import Homework.Homework10.p4.D;

public class Test {
//*Интерфейс – это конструкция языка программирования, которую часто
//сравнивают с контрактом. В этом контракте указанно, что класс сможет делать,
//т.е. какие методы в нём будут присутствовать, если он имплементирует
//данный интерфейс. Когда класс имплементирует какой либо интерфейс, он
//обязуется снабдить методы этого интерфейса телами (перезаписать
//абстрактные методы); в противном случае класс должен стать абстрактным.
//Т.о. если известно, что класс имплементировал какой либо интерфейс, то в
//этом классе гарантированно будут методы из интерфейса.

    //Правила Интерфейса
//* Невозможно создать объект интерфейса, потому что это не класс.
//* У интерфейса нет конструкторов.
//* Access modifier у всех топ-левел интерфейсов или public, или default.
//* Если не указать самостоятельно, то компилятор добавит в определение интерфейса слово abstract.
//* Интерфейс не может быть final.
//*Если не указать самостоятельно, то компилятор добавит в определение всех
//* non-default (не access modifier) и non-static методов слова abstract и public.
//* Методы интерфейса не могут быть final.
//* Из переменных в интерфейсе могут быть только константы, которые должны быть в нём инициализированны.
//* Если не указать самостоятельно, то компилятор добавит в определение всех переменных слова public, final и static.
//* Если класс, который имплементировал интерфейс не перезаписал все его методы, то этот класс должен объявляться abstract.

    public static void main(String[] args) {
        Help_able ha = new Driver();
        Swim_able sa = new Driver();
        //Переменные типа интерфейса могут ссылаться на объекты класса
        ha.pomosh();
        ha.tushitPojar();
        //так же как и с наследовнием,мы можем вызвать методы и переменные,которые есть в переменной типа интерфейса.

    }


}

class Employee {
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

//Что бы воспользоваться interface в нужном нам классе перед телом пишем implements-name iterface-
class Teacher extends Employee implements Help_able {
    //implements - имплементирует наш интерфейс
    public void pomosh() {  //по дефолту все методы интерфейса -public-
        System.out.println("Uchitel okazivat pomosh");
    }

    public void tushitPojar() {
        System.out.println("Uchitel tushit pojar");
    }

    int kolichesctvoUchenikov;

    void teach() {
        System.out.println("uchit");
    }

}

class Driver extends Employee implements Help_able, Swim_able {
    // что бы имплементировать сразу более 1 интерфейса перечислем их через запятую

    @Override
    public void swim() {
        System.out.println("Driver plavaet");
    }
    public void pomosh() {
        System.out.println("Driver okazivat pomosh");
    }

    public void tushitPojar() {
        System.out.println("Driver tushit pojar");
    }



    String CarName;

    void drive() {
        System.out.println("Vodit");
    }
}

interface Help_able {
    void pomosh(); //interface может содержать в себе только абстрактные методы

    void tushitPojar();
}

interface Swim_able {
    void swim();
    //Абсолютно все переменные в интерфейсе константы.
    int a = 4; //даже если самому не указать, джава сама добавит public final static
}
