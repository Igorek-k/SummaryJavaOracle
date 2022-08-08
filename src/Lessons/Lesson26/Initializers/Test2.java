package Lessons.Lesson26.Initializers;

public class Test2 {
    int a = 3;

    Test2() {
        a = 4;
    }

    {
        a = 5;
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.a);  //result a = 4;
    }
}

class A {
    static final int a;

    static {
        a = 6;  //статические константы можно объявлять при создании и в статических Initializers
    }

    final int b;

    A() {
        b = 5; //Не статические константы можно объявить при создании и в конструкторе
    }

//    int d =5;
//    static {
//         d = 3;       //не статическую переменную нельзя объявить в статическом Initializers
//    }
}

class B {
    //Порядок вывода ( срабатывания) :
    String s = "ok";

    {
        System.out.println(s);                                     // *4* срабатывает первый Initializers
    }

    static int i = 0;                                              //  *1*       создается int

    static {                                                       // *2*        срабатывает статический Initializers
        System.out.println(i);
    }

    {
        i = i + 1;
        System.out.println(i);                                   // *5*      срабатывает второй Initializers
    }

    B() {
        System.out.println("It is konstructor");                  // *6*     срабатывает конструктор
    }

    public static void main(String[] args) {
        System.out.println("Privet");                           // *3*      срабатывает наша команда вывода
        B b = new B();
        System.out.println("GG");                                 // *7* срабатывает вторая команда вывода
    }
}

class C {
    //Порядок вывода ( срабатывания) :

    static {
        abc(2);                                  // *1* срабатывает статический Initializers
    }

    static void abc(int a) {
        System.out.println(a + " ");
    }

    C() {
        abc(5);                       // *6* срабатывает конструктор
    }

    static {
        abc(4);                            // *2* срабатывает статический второй Initializers
    }

    {
        abc(6);                       // *4* срабатывает первый Initializers
    }

    static {
        new C();                    // *3* срабатывает третий статический Initializers, в котором создается объект
    }                           //перед вызовом конструктора объекта срабатывают все остальные Initializers

    {
        abc(8);                 // *5* срабатывает второй Initializers
    }

    public static void main(String[] args) {

    }
}
