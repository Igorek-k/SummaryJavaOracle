package Lessons.Lesson14;

import java.sql.SQLOutput;

public class Test3 {
    public static void main(String[] args) {
        int a = 5;
        if (a > 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hi");
            }
        }
    }
}

class Test4 {
    //break - мы можем использовать со всеми циклами!
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }
        //Если мы хотим создать код,который будет выводить от 1 до 100,но что бы не выводилось число 87,то используем
        // statement continue;
        for (int i = 1; i <= 10; i++) { // выведет числа 1-6, 8-10;
            if (i == 7) {
                continue;
            }
            System.out.println(i);

        }
        for (int i = 1; i <= 100; i++) { // выведет числа 1-6, 8-10;
            if (i == 7) {
                continue;
            }
            if (i%55 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}