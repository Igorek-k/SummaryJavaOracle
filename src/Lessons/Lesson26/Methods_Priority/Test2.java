package Lessons.Lesson26.Methods_Priority;

public class Test2 {
    static void abc(String s) {
        System.out.println("A");
    }

    static void abc(Object s) {
        System.out.println("B");
    }

    static void abc(String... s) {
        System.out.println("C");
    }

    static void abc(String s, String s1) {
        System.out.println("D");
    }


    static void def(Long a) {
        System.out.println("A");
    }

    static void def(Long... a) {
        System.out.println("B");
    }

    static void def(long a) {
        System.out.println("C");
    }

    static void def(Object a) {
        System.out.println("D");
    }

    static void def(Integer a) {
        System.out.println("E");
    }

    public static void main(String[] args) {
        abc("hi"); //Приоритеты как и для примитивных: 1.String | 2.Object | 3.Varargs
        abc("Hi", "!!"); // Приоритет: 1.String,String | 2. Varargs

        def(50); //Приоритет: 1.long | 2.Integer | 3.Object  ||| в  Long а и Varargs Long - конвертация невозможна!
//  * /||Конвертация типов данных для соответствия параметр листу метода не может происходить в 2 этапа||\ *

    }
}
