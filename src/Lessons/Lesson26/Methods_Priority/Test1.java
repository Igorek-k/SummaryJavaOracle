package Lessons.Lesson26.Methods_Priority;

public class Test1 {
//*   Method overloading, приоритетность методов
//* Если при вызове метода его параметр лист соответствует нескольким параметр листам overloaded методов,
//то приоритет их вызова выглядит следующим образом:
//1. Точное совпадение типов данных;
//2. Поглощающие типы данных (большие типы данных для primitive и parent классы для reference типов);
//3. Autoboxed типы данных;
//4. Varargs.
    void abc(int i) {
        System.out.println("int");
    }

    void abc(byte i) {
        System.out.println("byte");
    }

    void abc(long i) {
        System.out.println("long");
    }


    void def(Object o) {
        System.out.println("Object");
    }

    void def(String s) {
        System.out.println("String");
    }

    void ghi(int a, int b) {
        System.out.println("Hello 1");
    }

    void ghi(long a, long b) {
        System.out.println("Hello 2");
    }

    void ghi(Integer a, Integer b) {
        System.out.println("Hello 3");
    }

    void ghi(int... a) {
        System.out.println("Hello 4");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(5); //по дефолту -5- всегда инт. Если инта не будет,то -5- конверируется в тип данных с самой большой
        //вместительностью

        t.def("Hello");  //приоритет String он же и вызовется - самое точное сходство
        t.def(new StringBuilder("Hi")); //тут уже вызовется Object
        t.ghi(1, 2); // приоритеты: 1.int,int | 2. long.long | 3.Integer,Integer | 4.int ... a
    }
}
