package Lessons.Lesson27.Exceptions.Overriding_Overloading_Constructors;

import java.io.*;

public class Test {
//*Если класс перезаписывает метод из супер класса или имплементирует метод из интерфейса непозволительно добавлять
// в его сигнатуру новые checked исключения. Можно в сигнатуре метода использовать только исключения из
//перезаписанного метода супер класса или дочерние классы данных исключений.

//* Вышенаписанное правило никаким образом не относится к перезагруженным методам и RuntimeException.
}

class Animal {
    void run() throws IOException {     //Если мы выкинули уже Exception
        System.out.println("Animal run");
    }
}

class Mouse extends Animal {
    void run()  throws /*Exception */NullPointerException,ArrayIndexOutOfBoundsException{
        //То при перезаписи нельзя использовать Exception более широкие. Только такой же или дочерний
        System.out.println("Mouse run");     //На RuntimeExceptions не распространяется. Только на checked Exception
    }

    //Overload method могут бросать какие угодно Exception
}
