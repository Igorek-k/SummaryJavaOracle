package Lessons.Lesson26.Initializers;

public class Test3 {
//*         Non-static and static initializers
//* Initializer block срабатывает каждый раз, когда создаётся новый объект соответствующего класса.
//* Static initializer block срабатывает один раз, когда класс загружается в память.
//* Равнозначные initializer блоки выполняются в той последовательности, в которой они описаны в классе.

//Последовательность инициализации initializer блоков и переменных:
//1. Статические блоки и переменные родительского класса;
//2. Статические блоки и переменные дочернего класса;
//3. Не статические блоки и переменные родительского класса;
//4. Конструктор родительского класса;
//5. Не статические блоки и переменные дочернего класса;
//6. Конструктор дочернего класса.
//Инициализация пунктов 3-6 происходит только и при каждом создании объекта.
    public static void main(String[] args) {
        Lev v = new Lev();  //при создании этого объекта все Initializers и конструкторы срабатывают, начиная от класса
        //родителя до текущего

        Lev v2 = new Lev(); //При повторном создании сработало бы все, кроме статических Initializers
    }
}

class Animal {
    Animal() {
        System.out.println("Konstructor of Animal");
    }

    static {
        System.out.println("Static init of Animal");
    }

    {
        System.out.println("Non-static init of Animal");
    }

}

class Mammal extends Animal {
    Mammal() {
        System.out.println("Konstructor of Mammal");
    }

    static {
        System.out.println("Static init of Mammal");
    }

    {
        System.out.println("Non-static init of Mammal");
    }

}

class Lev extends Mammal {
    Lev() {
        System.out.println("Konstructor of Lev");
    }

    static {
        System.out.println("Static init of Lev");
    }

    {
        System.out.println("Non-static init of Lev");
    }

}
