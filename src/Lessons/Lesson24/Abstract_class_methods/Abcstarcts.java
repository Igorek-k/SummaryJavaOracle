package Lessons.Lesson24.Abstract_class_methods;

public class Abcstarcts {
//*    abstract классы и abstract методы:
//Синтаксис:
//    abstract class Figura{
//        public void abc() { some code }
//        abstract int ploshad();
//    }

//***Правило abstract классов и abstract методов:
//* У abstract методов не бывает тела.
//* Невозможно создать объект abstract класса.
//* Если в классе есть abstract метод, то этот класс тоже должен быть abstract.
//* abstract класс может содержать, а может и не содержать abstract методы.
//* Дочерний класс должен перезаписать все abstract методы родительского класса или тоже быть abstract.
//* Можно использовать reference variable типа abstract класса, чтобы ссылаться на
//        объект дочернего класса, который не является abstract.
//* abstract класс не может быть final.
//* Переменные не могут быть abstract.
//* У abstract классов есть конструктор.
//* Любой перезаписанный метод может быть как abstract, так и не abstract.
//* Для методов недопустимо сочетание: final abstract, private abstract, static abstract
}


abstract class Figura { //объекты у абстрактных классов быть не может. Мы создаем abstract class,когда у нас есть
    //какое-то абстрактное понятие и его объект нам не нужен.

    int kolichestvoStoron = 0;

    abstract void perimetr();  //Абстрактным методам тело не нужно. Если есть тело(даже пустое) - метод не абстрактный

    abstract void ploshad(); //Если мы не знаем, что метод должен делать в саб классах - делаем его абстрактным

    void showInfo() {  //у абстрактных классов могут быть обычные методы
        System.out.println("Eto figura");
    }
}

class Kvadrat extends Figura { //класс,который перезаписывает все методы абстрактного класса - называется конкретным классом
    int kolichestvoStoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println("Perimetr kvadrata " + kolichestvoStoron * storona1);
    }

    public void ploshad() {
        System.out.println("Ploshad kvadrata " + storona1 * storona1);
    }
}

class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    public void perimetr() {
        System.out.println("Perimetr pryamougolnika " + 2 * (storona1 + storona2));
    }

    public void ploshad() {
        System.out.println("Ploshad pryamougolnika " + storona1 * storona2);
    }

}

class Okrujnost extends Figura {
    int kolichestvoStoron = 0;
    int radius = 3;
    final double P = 3.14;

    public void perimetr() {
        System.out.println("Perimetr okrujnosti " + 2 * P * radius);
    }

    public void ploshad() {
        System.out.println("Ploshad okrujnosti " + P * radius * radius);
    }

}

 abstract class ChetirehUgolnik extends Figura{
    public void def(){
        System.out.println("Eto ChetirehUgolnik");
    }
}
